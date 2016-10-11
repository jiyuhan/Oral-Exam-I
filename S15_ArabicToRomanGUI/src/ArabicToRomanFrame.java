/**
 * Created by thomas on 10/8/16.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ArabicToRomanFrame extends JFrame{
    private final JTextField arabic; // text field with set size
    private final JTextField roman; // text field with text

    public ArabicToRomanFrame() {
        super("Arabic/Roman Numbers Converter");
        setLayout(new FlowLayout());

        // construct textfield with 10 columns
        JLabel labelArabic = new JLabel("Arabic Numbers:");
        arabic = new JTextField("Enter arabic numbers here");
        labelArabic.setLabelFor(arabic);
        add(labelArabic);
        add(arabic);

        // construct textfield with default text
        JLabel labelRoman = new JLabel("Roman Numerals:");
        roman = new JTextField("Enter roman numbers here");
        labelRoman.setLabelFor(roman);
        add(labelRoman);
        add(roman);

        // register event handlers
        ArabicToRomanHandler handler = new ArabicToRomanHandler();
        arabic.addActionListener(handler);
        roman.addActionListener(handler);



        //I have learned about document handler from http://stackoverflow.com/questions/12483608/updating-the-sum-of-jtextfields-automatically-everytime-they-change-java
        //And its implementation from http://docs.oracle.com/javase/tutorial/uiswing/events/documentlistener.html
        /*arabic.getDocument().addDocumentListener(new DocumentListener() {

        });
        roman.getDocument().addDocumentListener(new DocumentListener() {

        });
        */

    }//end ButtonFrame

    // private inner class for event handling
    private class ArabicToRomanHandler implements ActionListener {
        // process textfield events
        @Override
        public void actionPerformed(ActionEvent event) {
            String string = "";
            // user pressed Enter in JTextField textField1
            if (event.getSource() == arabic)
                roman.setText(ArabicToRoman(arabic));
        }
    }




    /*
    // private inner class for event handling
    private class DocumentHandler implements DocumentListener {
        String newline = "\n";
        // process textfield events
        @Override
        public void update(DocumentEvent event) {
            // user pressed Enter in JTextField textField1
            if (event.getSource() == arabic) {

                //string = String.format("Roman Output: %s", event.getActionCommand());
            }

                // user pressed Enter in JTextField textField2
            else if (event.getSource() == roman) {

                //string = String.format("Roman Input: %s", event.getActionCommand());
            }
            // display JTextField content
            //JOptionPane.showMessageDialog(null, string);
        }
    }//end TextFieldHandler
    */
/*
    private String RomanToArabic(JTextField romanN){
        String romanNum = romanN.getText();

        if (arabicNumber < 1 || arabicNumber > 3999) {
            romanN.setText("Invalid Ro");
            return romanN.
        }


        int arabicNumber;
        arabicNumber = 0;
        while (romanNum.startsWith("M")) {public static void main(String[] args) {
        final HangmanFrame arabRome = new HangmanFrame();
        arabRome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        arabRome.setSize(350, 100);
        arabRome.setVisible(true);
            arabicNumber = arabicNumber + 1000;
            romanNum = romanNum.substring(0,1);
        }
        while (romanNum.startsWith("CM")) {
            arabicNumber = arabicNumber + 900;
            romanNum = romanNum.substring(0,2);
        }
        while (romanNum.startsWith("D")) {
            arabicNumber = arabicNumber + 500;
            romanNum = romanNum.substring(0,1);
        }
        while (romanNum.startsWith("CD")) {
            arabicNumber = arabicNumber + 400;
            romanNum = romanNum.substring(0,2);
        }
        while (romanNum.startsWith("C")) {
            arabicNumber = arabicNumber + 100;
            romanNum = romanNum.substring(0,1);
        }
        /*
        while (arabicNumber >= 100) {
            romanNumber += "C";
            arabicNumber -= 100;
        }
        while (arabicNumber >= 90) {
            romanNumber += "XC";
            arabicNumber -= 90;
        }
        while (arabicNumber >= 50) {
            romanNumber += "L";
            arabicNumber -= 50;
        }
        while (arabicNumber >= 40) {
            romanNumber += "XL";
            arabicNumber -= 40;
        }
        while (arabicNumber >= 10) {
            romanNumber += "X";
            arabicNumber -= 10;
        }
        while (arabicNumber >= 9) {
            romanNumber += "IX";
            arabicNumber -= 9;
        }
        while (arabicNumber >= 5) {
            romanNumber += "V";
            arabicNumber -= 5;
        }
        while (arabicNumber >= 4) {
            romanNumber += "IV";
            arabicNumber -= 4;
        }
        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber -= 1;
        }

        String arabicN = Integer.toString(arabicNumber);
        return arabicN;
    }
    */

    private String ArabicToRoman(JTextField arabicN){
        String arabicNum = arabicN.getText();
        int arabicNumber = Integer.parseInt(arabicNum);
        /*
        if (arabicNumber < 1 || arabicNumber > 3999) {
            romanN.setText("Invalid Ro");
            return romanN.
        }
        */
        String romanNumber = "";
        while (arabicNumber >= 1000) {
            romanNumber += "M";
            arabicNumber -= 1000;
        }
        while (arabicNumber >= 900) {
            romanNumber += "CM";
            arabicNumber -= 900;
        }
        while (arabicNumber >= 500) {
            romanNumber += "D";
            arabicNumber -= 500;
        }
        while (arabicNumber >= 400) {
            romanNumber += "CD";
            arabicNumber -= 400;
        }
        while (arabicNumber >= 100) {
            romanNumber += "C";
            arabicNumber -= 100;
        }
        while (arabicNumber >= 90) {
            romanNumber += "XC";
            arabicNumber -= 90;
        }
        while (arabicNumber >= 50) {
            romanNumber += "L";
            arabicNumber -= 50;
        }
        while (arabicNumber >= 40) {
            romanNumber += "XL";
            arabicNumber -= 40;
        }
        while (arabicNumber >= 10) {
            romanNumber += "X";
            arabicNumber -= 10;
        }
        while (arabicNumber >= 9) {
            romanNumber += "IX";
            arabicNumber -= 9;
        }
        while (arabicNumber >= 5) {
            romanNumber += "V";
            arabicNumber -= 5;
        }
        while (arabicNumber >= 4) {
            romanNumber += "IV";
            arabicNumber -= 4;
        }
        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber -= 1;
        }

        return romanNumber;
    }
}
