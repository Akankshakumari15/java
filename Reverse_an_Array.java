import java.util.Scanner;

public class Reverse_an_Array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size  = sc.nextInt();

        int [] arr = new int[size];
        System.out.println("Enter elements of array:");
            for(int i=0;i<=size-1;i++){
            arr[i]= sc.nextInt();
           }
        sc.close();
        
        int i=0;
        int j = size-1;
        int orig=0;
        int rev=0;
        while(i<=j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

        i++;
        j--;
        }
        System.out.println("The reversed array is:");
        for(int k = 0 ; k<arr.length;k++){
            System.out.println(arr[k]);
            arr[k]=rev;
        } 
        
        if(orig==rev){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }


    }
}
