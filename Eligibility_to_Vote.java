import java.util.Scanner;

public class Eligibility_to_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int a = sc.nextInt();
        sc.close();

        if(a>=18){
             System.out.println("Eligible to vote");
         }
         else{
         System.out.println("Not eligible to vote");
        }
    }
    
}
