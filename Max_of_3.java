import java.util.Scanner;

public class Max_of_3 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input 1st no:");
    int a = sc.nextInt();
    System.out.println("Input 2nd no:");
    int b = sc.nextInt();
    System.out.println("Input 3rd no:");
    int c = sc.nextInt();
    sc.close();
    if(a>b && a>c){
        System.out.println("a is greater than b and c");
    }
    else if(b>c){
        System.out.println("b is greater than a and c");
    }
    else {
        System.out.println("c is greater than a and b");
    }
}
}
