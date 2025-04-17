import java.util.Scanner;

public class Count_Even_Odd_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int even = 0;
        int odd=0;
       
         System.out.println("Enter elements in the array:");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
            else
                odd++;
        }
        sc.close();

        System.out.println("Even:"+even+ " Odd:"+odd);



    }
}
