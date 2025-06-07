import java.util.*;

public class Compress_the_String_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();
        // Compress and print the string
        compressString(input);
    }

    private static void compressString(String str) {
        int i = 0;

        while (i < str.length()) {
            char currentChar = str.charAt(i);
            int count = 1;

            // Count consecutive repeating characters
            while (i + 1 < str.length() && str.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }
            System.out.print(currentChar + "" + count);
            i++;
        }
        System.out.println(); 
    }
}


