import java.util.Scanner;

public class Linear_Search {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
       
         System.out.println("Enter elements in the array:");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter element to be searched in array:");
        int x = sc.nextInt();
        sc.close();
          
        System.out.println("Searching.......");
        boolean found=false;
        for(int index : arr){
        if(index ==x){
            found=true;
             break;
        }
    }
    if(found)
       System.out.println(x+" found in the array." );
    else
       System.out.println(x+" not found in the array.");
}
}
