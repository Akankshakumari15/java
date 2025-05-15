import java.util.Arrays;
import java.util.Scanner;


public class Kth_max_min_element_in_array {
     public static void main(String[] args) {
        int[] arr = {4, 5, 8, 6, 81, 23, 45, 72, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();

        if (arr.length < k || k <= 0) {
            System.out.println("Invalid input: k must be between 1 and the size of the array.");
            return;
        }

        Arrays.sort(arr);

        int kthMin = arr[k - 1];
        int kthMax = arr[arr.length - k];

        System.out.println("The " + k + "th minimum element is: " + kthMin);
        System.out.println("The " + k + "th maximum element is: " + kthMax);
    }
}


