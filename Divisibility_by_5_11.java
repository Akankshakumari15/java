import java.util.Scanner;

public class Divisibility_by_5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int x = sc.nextInt();
        sc.close();

        if(x%5==0 && x%11==0){
            System.out.println(x+" is divisible by 5 and 11");
        }
        else{
            System.out.println(x+" is not divisible by 5 and 11");
        }
    }
    
}
