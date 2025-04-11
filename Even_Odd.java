import java.util.*;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if(x%2==0){
            System.out.println("The number is even");    
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
