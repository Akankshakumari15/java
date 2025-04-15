import java.util.Scanner;

public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<n;i++){
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
    
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
        for(int p=1;p<=i;p++){
            System.out.print(" ");
        }

        for(int a=i;a<=n;a++){
            System.out.print("*");
        
        }
        for(int c=n;c>=i;c--){
            System.out.print("*");
        }
        System.out.println();
    }

    }
    
}
