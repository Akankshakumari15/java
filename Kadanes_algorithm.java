import java.util.Scanner;

public class Kadanes_algorithm {
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
       
        for(int i=0;i<=arr.length;i++){
              int sum=0; 
            for(int j=i;j<arr.length;j++){
              sum=sum+arr[j];
            }      
            System.out.println(sum);    
        }
        
       
        
    }
}
