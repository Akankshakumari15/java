import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        System.out.println("Enter value of b:");
        int b = sc.nextInt();
        sc.close();

        for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        }
    
}
