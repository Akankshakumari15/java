import java.util.Scanner;

public class Swap_Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
       
       
        //swapping using a third variable
        // int temp = a;
        // a=b;
        // b = temp;
        // System.out.println("a:"+a+",b:"+b);

        
        //swapping without using a third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a:"+a+",b:"+b);

    }
}
