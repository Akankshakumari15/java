import java.util.Scanner;

public class Swap_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //swapping using a third variable
        int temp = a;
        a=b;
        b = temp;
        System.out.println("a:"+a+",b:"+b);

        //swapping without using a third variable
        
    }
}
