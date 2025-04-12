import java.util.Scanner;

public class Reverse_No_Using_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        sc.close();

        int rev=0;
        while(n!=0){
            int x = n % 10;
            rev = rev * 10 + x;
            n=n/10;

        }
        System.out.println("The reversed number is "+rev);
    }
    
}
