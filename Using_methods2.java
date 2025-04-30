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
        for(int i =1;i<=p;i++){
            if (p%i==0) {
                count++;
            }
        
    }
    System.out.println(count);
}

public static void check_no_is_prime_or_not(int p){
    boolean isPrime=true;
    System.out.println("Prime or not: ");
    if(p<2){
        isPrime=false;
    }
    else{
        for(int i=2;i*i<=p;i++){
            if(p%i==0){
                isPrime=false;
                break;
                
            }

        }
    }
    if(isPrime){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
}

public static void prime_nos_between_1_to_100(){
    System.out.println("Prime nos between 1 to 100: ");
    
    for(int i=1;i<=100;i++){
        boolean isPrime=true;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                  isPrime=false;
                  break;
            }
        }
        if(isPrime){
            System.out.println(i);
        }
    }
    }

    public static void prime_nos_in_a_range(int n,int m){
        System.out.println("Prime nos in the given range: ");
    
    for(int i=n;i<=m;i++){
        boolean isPrime=true;
        for(int j=2;j*j<=i;j++){
            if(i%j==0){
                  isPrime=false;
                  break;
            }
        }
        if(isPrime){
            System.out.println(i);
        }
    }

    }
    public static void alternate_prime_nos_in_1_to_100(){
        System.out.println("Alternate prime nos between 1 to 100: ");
        int PrimeCount=0;
        for(int i=1;i<=100;i++){
            boolean isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                      isPrime=false;
                      break;
                }
            }
            if(isPrime){
                PrimeCount++;
                if(PrimeCount%2!=0){
                System.out.println(i);
            }
        }
        }

    }

    


public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int p=sc.nextInt();
        System.out.println("Enter a range: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        factors_of_a_no(p);
        sum_of_factors_of_a_num(p);
        count_no_of_factors_of_a_no(p);
        check_no_is_prime_or_not(p);
        prime_nos_between_1_to_100();
        prime_nos_in_a_range(n,m);
        alternate_prime_nos_in_1_to_100();
        
       

    }
    
}
