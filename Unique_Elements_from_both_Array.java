import java.util.Scanner;

public class Unique_Elements_from_both_Array {

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

        // int arr1[]={1,2,3};
        // int arr2[]={3,4,5};

        System.out.println("Unique elements :");
        

        //arr1 elements not in arr2
        for(int i=0;i<arr1.length;i++){
            boolean found = false;
            for(int j=0;j<arr2.length;j++){
            if(arr1[i]==arr2[j]){
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println(arr1[i]+" ");
        }
    }


        //arr2 elements not in arr1
        for(int i=0;i<arr2.length;i++){
            boolean found = false;
            for(int j=0;j<arr1.length;j++){
            if(arr2[i]==arr1[j]){
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println(arr2[i]+" ");
        }
    }
    }
    
}
