 import java.util.Scanner;

public class SubArrayWithTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and target
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the target sum: ");
        int targetSum = sc.nextInt();

        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int start=0;
        int currentSum=0;
        for(int end=0; end<arr.length;end++){
            currentSum=currentSum+arr[end];
        while (currentSum>targetSum && start<=end) {
            currentSum= currentSum-arr[start];
            start++;
        }   
        if (currentSum==targetSum) {
            System.out.println("Subarray found from index "+start+" to "+end);
            for(int i = start; i<=end;i++){
                System.out.println(arr[i]+" ");
            } 
            return;
           } 
        }
        System.out.println("No subarray found with the target sum.");
     }
}

    

