import java.util.Scanner;

public class Using_methods1 {
    public static void natural_nos(int n){
     System.out.println("Natural nos:");
     for(int i=1;i<=n;i++){
    System.out.println(i+" ");
      }

    }
    public static void even_nos(int n,int m){
        System.out.println("Even nos:");
        for(int i=n;i<=m;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }

    }

    public static void natural_nos_reverse(int n){
         System.out.println("Natural nos reverse:");
         for (int i=n;i>=1;i--){
            System.out.println(i +" ");
         }

    }
    public static void natural_nos_sum(int n){
        System.out.println("Natural nos sum: ");
        int i=0,sum=0;
        while(i<=n){
            sum=sum+i;
            i++;

        }
        System.out.println(sum);
    }

    

    public static void natural_nos_product(int n, int m){
        System.out.println("Natural nos product:");
        int product=n*m;
        System.out.println(product+" ");
    }

    public static void extract_digits_from_no(int p){
        System.out.println("Digits extracted from the no:");
        while(p>0){
        int digit=p%10;
        System.out.println(digit+" ");
        p=p/10;
        }
    }

    public static void count_digits_in_no(int p){
        System.out.println("No of digits in the no:");
        int count=0;
        while(p!=0){
            p=p/10;
            count++;
        }
        System.out.println(count+" ");
            
    }
    public static void reverse_of_no(int p){
        System.out.println("Reverse no: ");
        int reverse=0;
        while(p!=0) {
            int rem=p % 10;
            reverse=reverse*10+ rem;
            p=p/10;
            }
        System.out.println(+reverse);
    }

    public static void check_no_is_palindrome_or_not(int p) {
        int original=p;
        System.out.println("Palindrome: ");
        int reverse=0;
        while(p!=0) {
            int rem=p % 10;
            reverse=reverse*10+ rem;
            p=p/10;
            }
        if(original==reverse){
            System.out.println("Yes");
        }
        else{
            System.out.println("No ");
        }
        
        
    }
    


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter a number:");
        int p = sc.nextInt();
        sc.close();
        natural_nos(n);
        even_nos(n,m);
        natural_nos_reverse(n);
        natural_nos_sum(n);
        natural_nos_product(n,m);
        extract_digits_from_no(p);
        count_digits_in_no(p);
        reverse_of_no(p);
        check_no_is_palindrome_or_not(p);
    }

}
