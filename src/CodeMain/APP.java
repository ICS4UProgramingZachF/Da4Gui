package CodeMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class APP {

    /* this program get's the user's input as a number witch is 1 , 0.5 or 0.25 wich is the with of the logs the
    dose math to find out how many logs can fit on a trck if the truck's max waitght is 1100k
     */

    //objects on the form
    private JPanel PanelMain;
    private JButton btncal;
    private JTextField txtE;
    private JLabel lblA;

    //global varuble
    double total;

    public APP() {
        btncal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                //reads the user's input
                double reader = Double.parseDouble(txtE.getText());

                //dose the math
                total = 1100/(reader * 20);

                //this displays the awnser
                lblA.setText(Double.toString(total));
            }
        });
    }

    //displays the form and makes it interractable
    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new APP().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
