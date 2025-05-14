import java.util.Scanner;

public class To_Find_First_Three_Maximum_Element_in_Array {
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
        int max1 = arr[0];
        int max2 =arr[0];
        int max3 =arr[0];
        for(int i =1;i<size;i++){
            if (arr[i] > max1){
               max3 = max2;
               max2 = max1;
               max1 = arr[i];
            }
            else if (arr[i] > max2 && arr[i]!=max1) {
                max3 = max2;
                max2 = arr[i];
                 }
            else if (arr[i] > max3 && arr[i]!=max1 && arr[i]!=max2) {
                max3 = arr[i];
            }    
        }
       
        System.out.println("Maximum element in the array: " +max1+" , "+max2+" , "+max3);
        
        
        }

}
