import java.util.Scanner;

public class Inverted_Pyramid {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        sc.close();  
    
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){
                System.out.print("*");
            
            }
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    }
    

