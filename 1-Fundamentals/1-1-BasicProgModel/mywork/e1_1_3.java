import edu.princeton.cs.algs4.StdOut;

public class e1_1_3 {


    public static void main(String[] args) {
        int arg0 = Integer.parseInt(args[0]);
        int arg1 = Integer.parseInt(args[1]);
        int arg2 = Integer.parseInt(args[2]);

        if(arg0 == arg1  && arg1 == arg2) {
            StdOut.print("equal");
        } else {
            StdOut.print("not equal");
        }
    }
}

//java -cp /c/Users/USER/codes/algs4.jar