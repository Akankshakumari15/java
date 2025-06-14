public class Sorted_and_rotaed_or_not {
    
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2}; 
        int n = arr.length;

        if (isSortedAndRotated(arr, n)) {
            System.out.println("The array is sorted and rotated.");
        } else {
            System.out.println("The array is NOT sorted and rotated.");
        }
    }

    public static boolean isSortedAndRotated(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
        }
        return count == 1;
    }
}


