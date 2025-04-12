import java.util.Scanner;

public class Factorial_using_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        sc.close();

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of "+n+" is " +fact);
    }
}
