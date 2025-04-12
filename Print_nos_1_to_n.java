import java.util.Scanner;

public class Print_nos_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();

        for(int i=0;i<=n;i++){
            System.out.println(i);
        }
    }
    
}
