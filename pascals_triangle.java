import java.util.*;
public class pascals_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // next number
            }

            System.out.println(); // Newline after each row
        }
      sc.close();
    }
}


