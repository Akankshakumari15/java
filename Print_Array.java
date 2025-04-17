import java.util.Scanner;

public class Print_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size  = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter elements of array:");
            for(int i=0;i<size-1;i++){
            arr[i]= sc.nextInt();
           }
        sc.close();
        System.out.println("The array given is:");
        for(int k = 0 ; k<arr.length;k++){
            System.out.println(arr[k]);
        }        
        //int [] arr = {1,2,3,4,5};
        // for(int i=0;i<arr.length;i++)
        //       System.out.print(arr[i]);
    }
    
}
