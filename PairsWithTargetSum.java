import java.util.Scanner;

public class PairsWithTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and target
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Find and display pairs
        boolean pairFound = false;
        System.out.println("Pairs of numbers that sum to the target (" + target + "):");
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }

        if (!pairFound) {
            System.out.println("No pairs found with the given target sum.");
        }
    }
}
