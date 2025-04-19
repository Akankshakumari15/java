import java.util.Scanner;

public class Sum__of_Two_Arrays_into_Third_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size  = sc.nextInt();
       
        int [] arr1 = new int[size];
        int [] arr2 = new int[size];
        int [] arr3 = new int[size];

        System.out.println("Enter elements of first array:");
           
        for(int i=0;i<size;i++){
            arr1[i]= sc.nextInt();
           }

        System.out.println("Enter elements of second array:");
           
           for(int j=0;j<size;j++){
            arr2[j]= sc.nextInt();
           }
        sc.close();

        for(int k=0;k<size;k++){
            arr3[k]=arr1[k]+arr2[k];
    }
    }
}

