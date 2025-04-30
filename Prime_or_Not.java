import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a no:");
        int x = sc.nextInt();
        sc.close();

        boolean isPrime=true;
    System.out.println("Prime or not: ");
    if(x<2){
        isPrime=false;
    }
    else{
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                isPrime=false;
                break;
                
            }

        }
    }
    if(isPrime){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
}
