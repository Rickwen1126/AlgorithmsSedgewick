package mywork;
import edu.princeton.cs.algs4.StdOut;

public class e1_1_11 {
    public static void printBoolArrayWithStar(boolean[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                StdOut.printf("Row:%d, Col:%d :", row, col);
                if(arr[row][col] == true) {
                    StdOut.print("*");
                } else {
                    StdOut.print(" ");
                }

                StdOut.println();
            }
        }
    }
    public static void main(String[] args) {
        boolean[][] arr = {{true, true, false, false},{true, true, false, false},{true, true, false, false}};
        printBoolArrayWithStar(arr);
    }
}
