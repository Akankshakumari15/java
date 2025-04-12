import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number:");
         int a = sc.nextInt();
         sc.close();
         switch(a){
            case 1:System.out.println("anuu");
                   break;
            case 2:System.out.println("akuu");
                   break;
            case 3:System.out.println("namaste");
                   break;
            case 4:System.out.println("hello");
                   break;
            case 5:System.out.println("hii");
                   break;
            default:System.out.println("byee");
                   break;
         }
    }
    
}
