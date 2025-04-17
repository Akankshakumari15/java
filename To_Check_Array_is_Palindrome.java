import java.util.Scanner;

public class To_Check_Array_is_Palindrome {
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

         int i=0;
         int j=size-1;
         boolean palindrome=true;

         while(i<j){
            if(arr[i]!=arr[j]){
                palindrome=false;
                break;
            }
            i++;
            j--;
         }

         if(palindrome){
            System.out.println("Array is a palindrome.");
         }
         else{
            System.out.println("Array is not a palindrome.");
         }

    }
}
