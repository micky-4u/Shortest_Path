package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import Main.MainProgram;

public class AppGUI {
    private JPanel panel1;
    private JTextField source;
    private JTextField destination;
    private JButton findPathButton;
    private JTextPane a1GreatHall2TextPane;


    MainProgram MP = new MainProgram();









    public AppGUI() {
        findPathButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
//                int min = showDistance();
                String src = source.getText();
                String des = destination.getText();

                int min = MP.showDistance(src, des);

                JOptionPane.showMessageDialog(null,"The shortest Path to destination your destination is " +min+
                "meters"
                +"\n Route:");


            }



        });
    }
    public static int convert(String str)
    {
        int val = 0;
        System.out.println("String = " + str);

        // Convert the String
        try {
            val = Integer.parseInt(str);
        }
        catch (NumberFormatException e) {

            // This is thrown when the String
            // contains characters other than digits
            System.out.println("Invalid String");
        }
        return val;
    }


    public static  void main(String[] args){
        JFrame frame = new JFrame("AppGUI");
        frame.setContentPane(new AppGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }



}
