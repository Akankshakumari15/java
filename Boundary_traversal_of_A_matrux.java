import java.util.*;
public class Boundary_traversal_of_A_matrux {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        // Input matrix elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
          }  } sc.close(); 
        System.out.println("Boundary Traversal:");
        printBoundary(matrix, rows, cols);
    } 
    static void printBoundary(int[][] matrix, int rows, int cols) {
        // Step 1: Top row
        for (int i = 0; i < cols; i++) {
            System.out.print(matrix[0][i] + " ");
        }
        // Step 2: Right column
        for (int i = 1; i < rows; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }
        // Step 3: Bottom row (only if more than 1 row)
        if (rows > 1) {
            for (int i = cols - 2; i >= 0; i--) {
                System.out.print(matrix[rows - 1][i] + " ");
            } }
         // Step 4: Left column (only if more than 1 column)
        if (cols > 1) {
            for (int i = rows - 2; i > 0; i--) {
                System.out.print(matrix[i][0] + " ");
            }
        }
    }
}




