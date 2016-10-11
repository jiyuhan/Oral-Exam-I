/**
 * Created by thomas on 10/4/16.
 */
import java.util.Scanner;
public class Message {
    private String message;
    private int key;
    public final static char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String encodedMessage;
    private String decodedMessage;

    private String getMessage() {
        return message;
    }

    private void setMessage() {
        System.out.println("New Message: ");
        Scanner scanner = new Scanner(System.in);
        String stringMsg = scanner.nextLine();
        stringMsg = stringMsg.toUpperCase();
        this.message = stringMsg;
    }

    private int getKey() {
        return key;
    }

    private void setKey(int key) {
        this.key = key;
    }

    private void encodeMessage(){
        int k = getKey();
        String message = getMessage();
        int len = message.length();
        char[] messageChar = message.toCharArray();
        char[] encodedMessage = message.toCharArray();//to make sure the char array always has the same
                                        //length as its input message.
        for(int i = 0; i < len; i++){
            int temp = (int)messageChar[i];
            int temp_integer = 64;
            if((65 <= temp) && (temp <= 90)) {
                //System.out.format("%d ", temp - temp_integer);
                //temp - temp_integer is the numeric of a letter
                int temp_k = (temp - temp_integer - 1) +k;

                if(26 <= temp_k)
                    temp_k = temp_k -26;
                encodedMessage[i] = alphabet[temp_k];

                //System.out.format("%d ", temp_k);
            }
        }
        String sEncodedMessage = new String(encodedMessage);
        this.encodedMessage = sEncodedMessage;
    }

    private String getEncodedMessage() {
        return encodedMessage;
    }

    public void newMessage() {
        setMessage();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's the key you want?");
        int k = scanner.nextInt();
        setKey(k);
        System.out.println("encoding...");
        encodeMessage();
        System.out.println(getEncodedMessage());
    }

    private void decodeMessage(){
        int k = getKey();
        String encodedM = getEncodedMessage();
        int len = encodedM.length();
        char[] encodedMChar = encodedM.toCharArray();
        char[] decodedMChar = encodedM.toCharArray();
        for(int i = 0; i < len; i++){
            int temp = (int)encodedMChar[i];
            int temp_integer = 64;
            if((65 <= temp) && (temp <= 90)) {
                //System.out.format("%d ", temp - temp_integer);
                //temp - temp_integer is the numeric of a letter
                int temp_k = (temp - temp_integer - 1) - k;
                //System.out.format("%d ", temp_k);
                if(0 > temp_k)
                    temp_k = temp_k + 26;
                decodedMChar[i] = alphabet[temp_k];

                //System.out.format("%d ", temp_k);
            }
        }
        String sDecodedMessage = new String(decodedMChar);
        this.decodedMessage = sDecodedMessage;
    }

    private String getDecodedMessage(){
        return decodedMessage;
    }

    public void decodeMessageP(){
        System.out.println("decoding...");
        decodeMessage();
        System.out.println(getDecodedMessage());
    }
}
