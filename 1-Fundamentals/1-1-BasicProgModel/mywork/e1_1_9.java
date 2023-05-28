package mywork;

import edu.princeton.cs.algs4.StdOut;

public class e1_1_9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String s = "";
        while(a != 0) {
            s = a % 2 + s;
            a /= 2;
        }

        StdOut.print(s);
    }
}
