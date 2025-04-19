import java.util.Scanner;

public class Sum_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int size1  = sc.nextInt();
        System.out.println("Enter size of second array:");
        int size2 = sc.nextInt();
        int [] arr1 = new int[size1];
        int sum1 =0 ;
        
        int [] arr = new int[size2];
        int sum2 =0 ;

        System.out.println("Enter elements of first array:");
           
        for(int i=0;i<=size1-1;i++){
            arr1[i]= sc.nextInt();
            sum1= sum1 +arr1[i];
           }
        System.out.println("Enter elements of second array:");
           
           for(int j=0;j<=size2-1;j++){
            arr[j]= sc.nextInt();
            sum2= sum2 +arr[j];
           }
        sc.close();
        System.out.println("Sum:"+sum1);
        System.out.println("Sum:"+sum2);
        System.out.println("Sum of both arrays:"+(sum1+sum2));
    }
    }

