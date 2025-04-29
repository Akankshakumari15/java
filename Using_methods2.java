import java.util.Scanner;

public class Using_methods2 {
    public static void factors_of_a_no(int p){
        System.out.println("Factors of "+p+": ");
        for(int i =1;i<=p;i++){
            if (p%i==0) {
                System.out.println(i);
            }
        }

    }
    public static void sum_of_factors_of_a_num(int p){
        System.out.println("Sum of factors of "+p+": ");
        int sum=0;
        for(int i =1;i<=p;i++){
            if (p%i==0) {
                sum=sum+i;
            }
        }
        System.out.println(sum);

    }

    public static void count_no_of_factors_of_a_no(int p){
        int count=0;
        System.out.println("Count of factors of"+p+": ");
        
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int p=sc.nextInt();
        sc.close();
        factors_of_a_no(p);
        sum_of_factors_of_a_num(p);
        count_no_of_factors_of_a_no(p);

    }
    
}
