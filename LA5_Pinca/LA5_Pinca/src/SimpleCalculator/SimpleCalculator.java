package SimpleCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JLabel Num1;
    private JLabel Num2;
    private JButton btnCompute;

    private JPanel panel;
    private JLabel lblResult;

    SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number1 = 0, number2 = 0;
                try {
                    number1 = Integer.parseInt(tfNumber1.getText());
                    number2 = Integer.parseInt(tfNumber2.getText());
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Must be a number");
                }

                int answer;
                lblResult.setText(String.valueOf(""));
                switch(cbOperations.getSelectedIndex()){
                    case 0:
                        answer = number1 + number2;
                        lblResult.setText(String.valueOf(answer));
                        break;
                    case 1:
                        answer = number1 - number2;
                        lblResult.setText(String.valueOf(answer));
                        break;
                    case 2:
                        answer = number1 * number2;
                        lblResult.setText(String.valueOf(answer));
                        break;
                    case 3:
                        if(number2 == 0){
                            JOptionPane.showMessageDialog(null,"Error: cannot divide by 0");
                            return;
                        }

                        answer = number1 / number2;
                        lblResult.setText(String.valueOf(answer));
                        break;
                }
            }
        });

    }
    public static void main(String[] args) {
        SimpleCalculator sample = new SimpleCalculator();
        sample.setTitle("Simple Calculator");
        sample.setContentPane(sample.panel);
        sample.setSize(new Dimension(700,300));     // sets the size of the panel
        sample.setDefaultCloseOperation(EXIT_ON_CLOSE);         // will not stop the program
        sample.setVisible(true);
    }
}
