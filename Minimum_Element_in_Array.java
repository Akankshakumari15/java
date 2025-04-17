import java.util.Scanner;

public class Minimum_Element_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
       
         System.out.println("Enter elements in the array:");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
         sc.close();


         int min = arr[0];
        for(int i =1;i<size;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum element in the array:" +min);
        }

    }

