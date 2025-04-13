import java.util.Scanner;

public class Prime_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int i;
        for ( i=2;i<=x/2;i++){
            if(x%i==0){
                System.out.println(x+" is not a prime number");
            break;
        }
    }
    if(i>x/2 && x>1){
        System.out.println(x+" is a prime number");
    }
    else if(x<=1){
        System.out.println(x+" is not a prime number");

    }
    }
}
