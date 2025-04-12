import java.util.Scanner;

public class Sum_Natural_nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        int sum=0;
        
        //using for loop
        // for(int i=0;i<=n;i++){
        //     sum=sum+i;
        // }
       
        //using while loop
        int i=0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println("sum:"+sum);
    }
    
}
