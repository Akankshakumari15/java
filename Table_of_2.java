import java.util.Scanner;

public class Table_of_2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int n = sc.nextInt();
         sc.close();

         for(int i=1;i<11;i++){
            System.out.println(" "+n+ "*"+""+i+"="+n*i);

         }

    }
    
}
