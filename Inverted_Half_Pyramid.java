import java.util.Scanner;

public class Inverted_Half_Pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        sc.close();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            
            }
            System.out.println();
        }
    }
    
}
