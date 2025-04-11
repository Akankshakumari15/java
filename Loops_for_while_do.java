import java.util.Scanner;

public class Loops_for_while_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        //for loop
        System.out.println("for loop");
        for(int i=0;i<=n;i++){
            
            System.out.println("Hello world");
           // System.out.println(i);

        }

        //while loop
        int i=0;
        System.out.println("while loop");
        while(i<=n){
            
            System.out.println("Hello world");
            i++;
           // System.out.println(i);
        }

        //do while loop
        System.out.println("do while loop");
        do{
         System.out.println("Hello world");
         i++;
        }while(i<=n);


    }
    
}
