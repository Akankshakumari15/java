import java.util.Scanner;

public class Sum_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size  = sc.nextInt();

        int [] arr = new int[size];
        int sum =0 ;

        System.out.println("Enter elements of array:");
           
        for(int i=0;i<=size-1;i++){
            arr[i]= sc.nextInt();
            sum= sum +arr[i];
           }
        sc.close();
        System.out.println("Sum:"+sum);
    }
    
}
