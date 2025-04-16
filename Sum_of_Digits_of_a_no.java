import java.util.Scanner;

public class Sum_of_Digits_of_a_no {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int sum =0;
        while(n>0){
          int rem= n%10;
          sum = sum+rem;
          n=n/10;  
        }

System.out.println("The sum of digits:" +sum);
    }
}
