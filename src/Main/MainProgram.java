package Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;


public class MainProgram {

    static final int N = 100005;
    static final int MAXI = 99999999;

    public  int showDistance(String s, String d)
    {
        ShortestDistance SD = new ShortestDistance();
        // Number of vertices and edges
        int n = 5;

        @SuppressWarnings("unchecked")
        ArrayList<ShortestDistance.Pair>[] weighted_edge = new ArrayList[N];

        for(int i = 0; i < N; i++)
        {
            weighted_edge[i] = new ArrayList<ShortestDistance.Pair>();
        }

        // Function call to add edges
        SD.add_edge(weighted_edge, 1, 2, 117);
        SD.add_edge(weighted_edge, 2, 3, 190);
        SD.add_edge(weighted_edge, 3, 4, 110);
        SD.add_edge(weighted_edge, 4, 5, 40);
        SD.add_edge(weighted_edge, 5, 6, 80);
        SD.add_edge(weighted_edge, 30, 7, 150);
        SD.add_edge(weighted_edge, 7, 8, 344);
        SD.add_edge(weighted_edge, 8, 9, 222);
        SD.add_edge(weighted_edge, 9, 10, 421);
        SD.add_edge(weighted_edge, 8, 11, 163);
        SD.add_edge(weighted_edge, 12, 13, 109);
        SD.add_edge(weighted_edge, 13, 14, 204);
        SD.add_edge(weighted_edge, 14, 15, 117);
        SD.add_edge(weighted_edge, 15, 16, 103);
        SD.add_edge(weighted_edge, 16, 17, 259);
        SD.add_edge(weighted_edge, 17, 18, 184);
        SD.add_edge(weighted_edge, 18, 19, 370);
        SD.add_edge(weighted_edge, 19, 49, 348);
        SD.add_edge(weighted_edge, 19, 20, 216);
        SD.add_edge(weighted_edge, 20, 21, 150);
        SD.add_edge(weighted_edge, 21, 22, 132);
        SD.add_edge(weighted_edge, 22, 23, 138);
        SD.add_edge(weighted_edge, 23, 24, 60);
        SD.add_edge(weighted_edge, 24, 2, 70);
        SD.add_edge(weighted_edge, 3, 25, 280);
        SD.add_edge(weighted_edge, 21, 25, 190);
        SD.add_edge(weighted_edge, 25, 26, 120);
        SD.add_edge(weighted_edge, 26, 27, 170);
        SD.add_edge(weighted_edge, 27, 28, 160);
        SD.add_edge(weighted_edge, 28, 11, 120);
        SD.add_edge(weighted_edge, 5, 26, 275);
        SD.add_edge(weighted_edge, 30, 29, 120);
        SD.add_edge(weighted_edge, 29, 27, 134);
        SD.add_edge(weighted_edge, 7, 32, 202);
        SD.add_edge(weighted_edge, 32, 31, 60);
        SD.add_edge(weighted_edge, 31, 28, 217);
        SD.add_edge(weighted_edge, 27, 51, 191);
        SD.add_edge(weighted_edge, 51, 50, 154);
        SD.add_edge(weighted_edge, 50, 13, 138);
        SD.add_edge(weighted_edge, 51, 16, 35);
        SD.add_edge(weighted_edge, 18, 20, 307);
        





        // Number of good nodes
        int k = 5;

        int[] a = new int[N],
                vis = new int[N],
                dist = new int[N];

        // To keep good vertices


        int S = convert(s);
        int D = convert(d);

        a[S] = a[D] = 1;



        return SD.minDistance(weighted_edge, n, dist, vis, a, k);



    }

    // converting from string to int
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

}

  
