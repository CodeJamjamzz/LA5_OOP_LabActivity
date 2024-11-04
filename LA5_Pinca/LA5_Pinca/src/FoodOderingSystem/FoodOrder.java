package FoodOderingSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Final
public class FoodOrder extends JFrame{
    private JCheckBox cSundae;
    private JCheckBox cPizza;
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cTea;
    private JCheckBox cSoftdrinks;
    private JButton btnOrder;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel panel;

    FoodOrder(){
        double[] foodPrice = {100,80,65,55,50,40};
        JCheckBox[] foods = {cPizza, cBurger, cFries, cSoftdrinks, cTea, cSundae,};
        double[] discountArray = {0,5,10,15};
        JRadioButton[] discounts = {rbNone, rb5, rb10, rb15};

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = 0;
                double discount = 0;
                for(int i = 0; i < 6; i++){
                    if(foods[i].isSelected()){
                        amount += foodPrice[i];
                    }
                }

                for(int i = 0; i < 4; i++){
                    if(discounts[i].isSelected()){
                        discount = amount * (discountArray[i] / 100);
                        amount -= discount;
                        break;
                    }
                }

                JOptionPane.showMessageDialog(null, "The total price is Php" + amount);

            }
        });
    }

    public static void main(String[] args) {
        FoodOrder sample = new FoodOrder();
        sample.setTitle("Food Ordering System");
        sample.setContentPane(sample.panel);
        sample.setSize(new Dimension(700,300));     // sets the size of the panel
        sample.setDefaultCloseOperation(EXIT_ON_CLOSE);         // will not stop the program
        sample.setVisible(true);
    }
}
