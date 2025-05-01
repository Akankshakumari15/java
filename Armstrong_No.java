import java.util.Scanner;

public class Armstrong_No {
    public static void check_armstrong_no_or_not(int x){
        int original=x;
        int sum=0;
        System.out.println("Armstrong no or not: ");
        while(original>0){
            int digit=original%10;
            sum=sum+digit*digit*digit;
            original=original/10;
        }
        if(sum==x){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static void armstrong_nos_between_1_to_100(){
       
        System.out.println("Armstrong no between 1 to 100: ");
        for(int i=1;i<=100;i++){
            int sum=0;
            int original=i;
           while (original>0){
               int digit=original%10;
               sum=sum+digit*digit*digit;
                original=original/10;
           }
        if(sum==i){
            System.out.println(i);
    }
}
}

public static void armstrong_nos_between_a_range(int n,int m){
    System.out.println("Armstrong no between given range: ");
        for(int i=n;i<=m;i++){
            int sum=0;
            int original=i;
           while (original>0){
               int digit=original%10;
               sum=sum+digit*digit*digit;
                original=original/10;
           }
        if(sum==i){
            System.out.println(i);
    }
  }
}

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter a no: ");
        int x = sc.nextInt();
        System.out.println("Enter a range:");
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        check_armstrong_no_or_not(x);
        armstrong_nos_between_1_to_100();
        armstrong_nos_between_a_range(n,m);
    }
}
