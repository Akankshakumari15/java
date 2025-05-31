import java.util.Scanner;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First array
        System.out.println("Enter number of rows and columns for the first array:");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int[][] arr1 = new int[rows1][cols1];

        System.out.println("Enter elements in the first 2D array:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // Second array
        System.out.println("Enter number of rows and columns for the second array:");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int[][] arr2 = new int[rows2][cols2];

        System.out.println("Enter elements in the second 2D array:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible.");
            sc.close();
            return;
        }

        // Result array
        int[][] result = new int[rows1][cols2];

        // Matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
