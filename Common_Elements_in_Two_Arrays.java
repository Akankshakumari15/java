import java.util.Scanner;

public class Common_Elements_in_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int size1  = sc.nextInt();
        System.out.println("Enter size of second array:");
        int size2 = sc.nextInt();
        int [] arr1 = new int[size1];
        int [] arr2 = new int[size2];
        if (size1 != size2) {
            System.out.println("Arrays are not equal.");
            sc.close();
            return;
        }
        

        System.out.println("Enter elements of first array:");
           
        for(int i=0;i<=size1-1;i++){
            arr1[i]= sc.nextInt();
           }
        System.out.println("Enter elements of second array:");
           
           for(int j=0;j<=size2-1;j++){
            arr2[j]= sc.nextInt();
           }

           sc.close();


           System.out.println("Common elements:");
           for(int k=0;k<size1;k++){
            for(int i=0;i<size2;i++){
                if(arr1[k]==arr2[i]){
                    System.out.println(arr1[k]+ " ");
                    break;
                }
            }
           }
    }
}
