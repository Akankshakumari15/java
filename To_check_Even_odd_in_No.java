import java.util.Scanner;

public class To_check_Even_odd_in_No {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        
        while(n>0){
          int rem= n%10;
          if(rem%2==0){
            System.out.println("The number is even.");    
        }
        else{
            System.out.println("The number is odd.");
        }
          n=n/10;  
        }
    }
}
