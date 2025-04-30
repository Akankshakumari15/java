import java.util.Scanner;

public class Perfect_nos {
     public static void check_no_is_perfect_or_not( int p){
        int sum=0;
        System.out.println("Perfect no or not: ");
        for(int i=1;i<p;i++){
            if(p%i==0){
            sum=sum+i;
            }
        }
        if(sum==p){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static void perfect_nos_between_1_to_100(){
        System.out.println("Perfect nos between 1 to 100: ");
        for(int j=1;j<=100;j++){
            int sum=0;
        for(int i=1;i<j;i++){
            if(j%i==0){
            sum=sum+i;
            }
        }
        if(sum==j){
            System.out.println(j);
        }
    }
}

public static void  perfect_nos_in_a_range(int n,int m){
    System.out.println("Perfect nos in the given range:");
  for(int i=n;i<=m;i++){
  int sum=0;
    for(int j=1;j<i;j++){
        if(i%j==0){
        sum=sum+j;
        }
    }
    if(sum==i){
          System.out.println(i+" ");
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
        
        check_no_is_perfect_or_not(p);
        perfect_nos_between_1_to_100();
        perfect_nos_in_a_range(n,m);

    
}
}
