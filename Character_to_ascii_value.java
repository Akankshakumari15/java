import java.util.Scanner;

public class Character_to_ascii_value {

    public static void main(String[] args) {
           
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the character:");
            char ch = sc.next().charAt(0);
            sc.close();
    
            int asciiValue = (int) ch;
            System.out.println("ASCII value of " +ch+ " is:" +asciiValue);
            
        }
    }
    

