import java.util.Scanner;

public class Check_if_String_is_Palindrome{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter string:");
            String str = sc.next();
            sc.close();
    
            String rev = "";
            int n = str.length();
    
            for (int i = n - 1; i >= 0; i--) {
                rev = rev + str.charAt(i);
            }
    
            System.out.println("Reversed string: " + rev);
    
            if (str.equals(rev)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }

    