package mywork;
import edu.princeton.cs.algs4.StdOut;

public class e1_1_5 {
    public static boolean IsBothBetween01(double x, double y) {
        return IsBetween01(x) && IsBetween01(y);
    }

    public static boolean IsBetween01(double x) {
        return x > 0 && x < 1;
    }

    public static void main(String[] args) {
        double a1 = Double.parseDouble(args[0]);
        double a2 = Double.parseDouble(args[1]);

        if (IsBothBetween01(a1, a2)) {
            StdOut.print("Yes");
        } else {
            StdOut.print("No");
        }
    }
}
