import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int original=n;
        int reverse=0;
        while(n>0){
          int rem= n%10;
          reverse = reverse *10 + rem;
          n=n/10;  
        }

        System.out.println("The reversed number:" +reverse);

        if(original==reverse){
            System.out.println("It is a palindrome.");
        }
        else{
            System.out.println("It is not a palindrome.");
        }
    }
}
