
import java.util.Scanner;

public class Arithemetic_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c=(float)b;
        sc.close();
        System.out.println("addition:" +(a+b));
        System.out.println("subtraction:" +(a-b));
        System.out.println("multiplication:" +(a*b));
        System.out.println("division:"+(a/c));
        System.out.println("remainder:"+(a%b));

        
    }
    
}
