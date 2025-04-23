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


         System.out.println("Prime nos in the array:");
         for(int i=0;i<size;i++){
            int num= arr[i];
            if(num>1){
                boolean isPrime =true;
                for(int j=2;j<=Math.sqrt(num);j++){
                    if (num%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(num+" ");
                }
            }
         }


         }
    }

