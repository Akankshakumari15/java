import java.util.Scanner;

public class Half_Pyramid_With_Numbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int n = sc.nextInt();
        sc.close();
        int x=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j );
                x=x/10;
                x++;
            }
            System.out.println();
        }

    }
}
