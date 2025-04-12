import java.util.Scanner;

public class Divisibility_by_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        sc.close();

        if(n%3==0){
            System.out.println(n+" is divisible by 3");
        }
        else{
            System.out.println(n+" is not divisible by 3");
        }

    }
}
