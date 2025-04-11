import java.util.Scanner;

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);
        sc.close();   

        if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
    }
    

