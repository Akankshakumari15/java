import java.util.Scanner;

public class Fibonacci_Nos {
    public static void fibonacci_nos(int n) {
        System.out.println("Fibonacci series: ");
         int a=0;
         int b=1;

      for(int i=0;i<n;i++){
        System.out.println(a+" ");
        int sum=a+b;
        a=b;
        b=sum;
      }
        
    }

    public static void fibonacci_nos_in_a_range(int k,int l){
        System.out.println("Fibonacci nos between "+k+" and "+l+" : ");
    
        int a=0;
        int b=1;
        while(a<=l){
            if(a>=k){
                System.out.println(a+" ");
            }
       int sum=a+b;
       a=b;
       b=sum;
    }
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        System.out.println("Enter a range: ");
        int k=sc.nextInt();
        int l=sc.nextInt();
        
        sc.close();
        fibonacci_nos(n);
        fibonacci_nos_in_a_range(k,l);
    }
    
}
