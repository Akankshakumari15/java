 import java.util.Scanner;

public class Occurence_of_Element_in_Array {
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
       for(int i=0;i<arr.length;i++){
       int count=0;
       boolean counted=false;
       for(int k=0;k<i;k++){
        if (arr[k]==arr[i]) {
            counted=true;
            break;
        }
       }
       if (counted) {
           continue;
       }
       for(int p=0;p<arr.length;p++){
        if (arr[p]==arr[i]) {
            count++;
    }
       }
       System.out.println(arr[i]+" occured "+count+" times.");
    }
}
}