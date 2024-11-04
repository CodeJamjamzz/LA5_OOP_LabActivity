package LeapYearChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame {
    private JTextField yearTextFeild;
    private JButton checkYearButton;
    private JPanel Panel;
    LeapYear(){
        yearTextFeild.setName("YearTextFeild");
        checkYearButton.setName("checkYearButton");

        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextFeild.getText());
                boolean answer = false;

                if(year == 0){
                    JOptionPane.showMessageDialog(null, "Not a leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                       if(year % 400 == 0){
                          JOptionPane.showMessageDialog(null,"Leap Year", "Message", JOptionPane.INFORMATION_MESSAGE);
                          return;
                       }
                        JOptionPane.showMessageDialog(null,"Not a leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    JOptionPane.showMessageDialog(null,"Leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                JOptionPane.showMessageDialog(null,"Not a leap Year","Message", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        });
    }
    public static void main(String[] args) {
        LeapYear sample = new LeapYear();                        // the file itself the one that we want to display
        sample.setTitle("Leap Year Checker");
        //sample.Panel.setBackground(Color.white);
        sample.setContentPane(sample.Panel);                     // it is a part of the frame in which the content is diplayed
        sample.setSize(new Dimension(700,300));     // sets the size of the panel
        sample.setDefaultCloseOperation(EXIT_ON_CLOSE);          // will not stop the program
        sample.setVisible(true);
    }
}
