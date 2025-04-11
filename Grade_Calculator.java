import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        sc.close();

        if (marks>=90){
            System.out.println("Grade A");
        }
        else if(marks>=75){
            System.out.println("Grade B");
        }
        else if(marks>=60){
            System.out.println("Grade C");
        }
        else if(marks>=55){
            System.out.println("Grade D");
        }
        else{
            System.out.println("FAIL");
        }
        


    }
    
}
