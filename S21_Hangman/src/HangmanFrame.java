/**
 * Created by thomas on 10/9/16.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HangmanFrame extends JFrame{

    private JPasswordField guessWord;
    private JTextField tryLetter;
    private String secretWord;
    private JTextField answer;

    public String getSecretWord() {

        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public HangmanFrame() {
        super("Hangman Game");
        setLayout(new FlowLayout());

        // construct textfield with 10 columns
        JLabel labelSecretWord = new JLabel("Secret Word Here: ");
        guessWord = new JPasswordField(20);
        labelSecretWord.setLabelFor(guessWord);
        add(labelSecretWord);
        add(guessWord);

        JLabel labelTryLetter = new JLabel("Your guess letter here: ");
        tryLetter = new JTextField(1);
        labelTryLetter.setLabelFor(tryLetter);
        add(labelTryLetter);
        add(tryLetter);

        JLabel labelAnswer = new JLabel("What you have guessed right: ");
        answer = new JTextField(20);
        answer.setEditable(false);
        labelAnswer.setLabelFor(answer);
        add(labelAnswer);
        add(answer);

        // register event handlers
        HangmanHandler handler = new HangmanHandler();
        guessWord.addActionListener(handler);
        answer.addActionListener(handler);
        tryLetter.addActionListener(handler);


    }
    private class HangmanHandler implements ActionListener {

        // process textfield events
        @Override
        public void actionPerformed(ActionEvent event) {
            String secretWord = "";

            // user pressed Enter in any JTextField
            if (event.getSource() == guessWord) {
                secretWord = guessWord.getText();
                // = secretWord.toString();
                System.out.format("%s", secretWord);
            }

            else if(event.getSource() == tryLetter){
                secretWord = guessWord.getText();
                answer.setText(checkInput(tryLetter, secretWord, answer));
            }
        }
    }
    /* This is a method to check if the player gets something right this time.
     *      Input: user's guessed letter, the real word, what he or she has gotten so far
     *      Output:what he or she got so far after this time.
     */
    public String checkInput (JTextField input, String secretWord, JTextField soFar){
        secretWord = secretWord.toLowerCase();
        int secretWordLen = secretWord.length();
        //char[] charSecretWord = secretWord.toCharArray();//the real word
        String answer = soFar.getText();
        answer = answer.toLowerCase();
        //char[] answerChar = answer.toCharArray();//the answer char array
        String userInput = input.getText();
        userInput = userInput.toLowerCase();
        char userInputChar = userInput.charAt(0);//the first letter user guessed
        System.out.format("\n%s %d %s %c", secretWord,secretWordLen, answer, userInputChar);
        for(int i = 0; i < secretWordLen; i++) {
            if(secretWord.charAt(i) == userInput.charAt(0)) {
                char[] temp = answer.toCharArray();
                temp[i] = userInputChar;
                answer = new String(temp);
            }
            else{
                char[] temp = answer.toCharArray();
                temp[i] = '*';
                answer = new String(temp);
            }
        }
        return answer;
    }
}
