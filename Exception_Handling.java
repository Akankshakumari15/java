import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        sc.close();
        // int a=18;
        // int b=0;

        //EX 1
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("we cannot divide by zero.");
        }
        System.out.println("hello");
        System.out.println("hi");
        System.out.println("byee");


        //EX 2
        int [] arr={1,2,3,45,6};
        try {
           System.out.println(arr[6]); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            System.out.println("the index is out of bound.");
        }
        finally{
            System.out.println("all is fine.");
        }
        
        System.out.println("hiiii");
    }
}
