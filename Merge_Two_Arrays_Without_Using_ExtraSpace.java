public class Merge_Two_Arrays_Without_Using_ExtraSpace {
    
      public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int i = m - 1; // Pointer for arr1's actual elements
        int j = n - 1; // Pointer for arr2
        int k = m + n - 1; // Pointer for the end of arr1 where we place the merged elements
        
        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k--] = arr1[i--];
            } else {
                arr1[k--] = arr2[j--];
            }
        }
         // If there are remaining elements in arr2, copy them
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }
    }
        public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 5, 7, 0, 0, 0}; 
        int[] arr2 = new int[] {2, 4, 6};
        int m = 4; // No. of actual elements in arr1
        int n = arr2.length; // No. of elements in arr2
        
        // Merge arr2 into arr1
        merge(arr1, m, arr2, n);
        System.out.println("Merged array: ");
        // Print the merged array
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

}




