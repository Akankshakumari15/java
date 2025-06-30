
import java.util.Scanner;
public class Search2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
            {1, 4, 7},
            {8, 10, 12},
            {13, 15, 18} };
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        sc.close();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0, col = cols - 1;
        boolean found = false;
         while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                found = true;
                break;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++; }}
         if (!found) {
            System.out.println("Element not found in the matrix.");
        }
         sc.close();  }}
