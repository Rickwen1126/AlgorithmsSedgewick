package mywork;
import edu.princeton.cs.algs4.StdOut;
public class e1_1_14 {
        public static int lg(int n) {
            if (n == 1) {
                return 0; 
            }

            if (n == 2) {
                return 1;
            }

            int result = -1;
            while(n > 0) {
                result++;
                n /= 2;
            }
            

            return result;
        }
        public static void main(String args[]) {
            int n = Integer.parseInt(args[0]);
            StdOut.print(lg(n));
        }
}
