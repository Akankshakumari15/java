import java.util.Arrays;

public class To_Check_If_Two_Strings_Are_Anagrams {
    public static void main(String[] args) {
        
        //input
        String str1 = "heart";
        String str2 = "earth";

        // Converting to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sorting the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Comparing the arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
