import java.util.Scanner;

public class Max_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a ");
        }
        
    }
    
}
