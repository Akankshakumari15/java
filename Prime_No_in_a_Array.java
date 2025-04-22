import java.util.Scanner;

public class Prime_No_in_a_Array {
    
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

        int  count=0;
         for(int i=0;i<size;i++){
            for(int j=0;j<=10;j++)
            {
                if(arr[i]%j==0)
                   count++;
            }
            if(count<2)
            System.out.println(arr[i]+"prime nos");

int i=9;
         }
    }
}
