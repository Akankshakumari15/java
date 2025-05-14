import java.util.PriorityQueue;
// time complexity::O(n log K)
import java.util.Scanner;

public class To_Find_Kth_Maximum_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        

        System.out.println("Enter K:");
        int K = sc.nextInt();
        sc.close();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num);
            if (minHeap.size() > K) {
                minHeap.poll();
            }
        }

        System.out.println("The " + K + "th maximum element is: " + minHeap.peek());
    }
}


