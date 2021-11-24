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


    static final int N = 100005;
    static final int MAXI = 99999999;

    public int showDistance()
    {
        ShortestDistance SD = new ShortestDistance();
        // Number of vertices and edges
        int n = 25;

        @SuppressWarnings("unchecked")
        ArrayList<ShortestDistance.Pair>[] gr = new ArrayList[N];

        for(int i = 0; i < N; i++)
        {
            gr[i] = new ArrayList<ShortestDistance.Pair>();
        }

        // Function call to add edges
        SD.add_edge(gr, 0, 1, 139);
        SD.add_edge(gr, 1, 2, 100);
        SD.add_edge(gr, 2, 3, 90);
        SD.add_edge(gr, 3, 4, 120);
        SD.add_edge(gr, 4, 5, 101);
        SD.add_edge(gr, 5, 6, 118);
        SD.add_edge(gr, 6, 7, 93);
        SD.add_edge(gr, 7, 8, 90);
        SD.add_edge(gr, 8, 9, 79);
        SD.add_edge(gr, 8, 12, 50);
        SD.add_edge(gr, 12, 13, 64);
        SD.add_edge(gr, 13, 14, 196);
        SD.add_edge(gr, 14, 15, 67);
        SD.add_edge(gr, 15, 16, 183);
        SD.add_edge(gr, 16, 17, 95);
        SD.add_edge(gr, 17, 18, 61);
        SD.add_edge(gr, 6, 21, 207);
        SD.add_edge(gr, 19, 20, 46);
        SD.add_edge(gr, 20, 21, 40);
        SD.add_edge(gr, 21, 22, 264);
        SD.add_edge(gr, 22, 23, 100);
        SD.add_edge(gr, 23, 24, 37);










        // Number of good nodes
        int k = 20;

        int[] a = new int[N],
                vis = new int[N],
                dist = new int[N];

        // To keep good vertices
        String s = source.getText();
        String d = destination.getText();

        int S = convert(s);
        int D = convert(d);

        a[S] = a[D] = 1;



        return SD.minDistance(gr, n, dist, vis, a, k);


    }

    public AppGUI() {
        findPathButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                int min = showDistance();

                JOptionPane.showMessageDialog(null,"The shortest Path to destination your destination is "
                +min+"meters"
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
