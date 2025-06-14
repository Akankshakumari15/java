import java.util.*;
public class Spiral_Traversal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // Input: matrix size
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt(); } }sc.close();
         System.out.println("Spiral Traversal of the matrix:");
         int top = 0, bottom = rows - 1;
         int left = 0, right = cols - 1;
          while (top <= bottom && left <= right) {
             // Traverse from left to right (top row)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " "); }
            top++;
             // Traverse from top to bottom (right column)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");  }
            right--;
             // Traverse from right to left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " "); }
                bottom--;  }
             // Traverse from bottom to top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");  }
                left++; }
        }
    }
}




