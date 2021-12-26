import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private  double total1 = 0.0;
    private  double total2 = 0.0;
    private  char math_operator;

    private JPanel Calculator;
    private JTextField textDisplay;
    private JButton buttonEqual;
    private JButton buttonPlus;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button8point;
    private JButton button9divide;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button13multi;
    private JButton button14sub;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a0Button;
    private JButton clearButton;
    private JButton a7Button;

    private void getOperator (String buttonText){
        math_operator = buttonText.charAt(0);
        total1 = total1 + Double.parseDouble( textDisplay.getText());
        textDisplay.setText(" ");

    }

    public Calculator() {
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a7ButtonText = textDisplay.getText()+a7Button.getText();
                textDisplay.setText( a7ButtonText);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a8ButtonText = textDisplay.getText()+a8Button.getText();
                textDisplay.setText( a8ButtonText);

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a9ButtonText = textDisplay.getText()+a9Button.getText();
                textDisplay.setText( a9ButtonText);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a4ButtonText = textDisplay.getText()+a4Button.getText();
                textDisplay.setText( a4ButtonText);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a5ButtonText = textDisplay.getText()+a5Button.getText();
                textDisplay.setText( a5ButtonText);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a6ButtonText = textDisplay.getText()+a6Button.getText();
                textDisplay.setText( a6ButtonText);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a1ButtonText = textDisplay.getText()+a1Button.getText();
                textDisplay.setText( a1ButtonText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a2ButtonText = textDisplay.getText()+a2Button.getText();
                textDisplay.setText( a2ButtonText);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a3ButtonText = textDisplay.getText()+a3Button.getText();
                textDisplay.setText( a3ButtonText);
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a0ButtonText = textDisplay.getText()+a0Button.getText();
                textDisplay.setText( a0ButtonText);
            }
        });
        button8point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals(" ")) {
                    textDisplay.setText(" 0.");
                } else if (textDisplay.getText().contains(".")) {
                    button8point.setEnabled(false);
                } else {
                    String button8pointText = textDisplay.getText() + button8point.getText();
                    textDisplay.setText(button8pointText);
                }
                button8point.setEnabled(true);
            }
        });


        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonPlus.getText();
                getOperator(button_text);
            }
        });
        buttonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble( textDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble( textDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble( textDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble( textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(total2));
                total1=0;

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textDisplay.setText(" ");

            }
        });

        button14sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text =  button14sub.getText();
                getOperator(button_text);

            }
        });
        button9divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = button9divide.getText();
                getOperator(button_text);

            }
        });
        button13multi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = button13multi.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
