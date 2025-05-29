
import java.util.Scanner;

public class Transpose_of_a_Matrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Input: Number of rows and columns
        System.out.println("Enter number of rows and columns in the array:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        
        // Input: Matrix elements
        System.out.println("Enter elements in the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        // Output: Transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println();
        }
    }
}

