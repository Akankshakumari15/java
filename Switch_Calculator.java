import java.util.Scanner;

public class Switch_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter value of a:");
         int a = sc.nextInt();
         System.out.println("Enter value of b:");
         int b = sc.nextInt();
         System.out.println("A - Addition\nB - Subtraction\nC - Multiplication\nD - Division\nEnter your choice for operation:");
         System.out.println("Enter the operator:");
         char op = sc.next().charAt(0);
         float c=b;
         sc.close();

         switch(op){

            
            case 'A': System.out.println("Addition: "+(a+b));
            break;
            case 'B': System.out.println("Subtraction: "+(a-b));
            break;
            case 'C': System.out.println("Multiplication: "+(a*b));
            break;
            case 'D': System.out.println("Division: "+(a/c));
            break;
            default: System.out.println("Invalid operation");
            break;
            
         }

    }
    
}
