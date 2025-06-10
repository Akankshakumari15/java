
    public class MaxProductSubarray {
   public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -2};
        int result = maxProduct(arr);
        System.out.println("\nMaximum product subarray value: " + result);
    }
    static int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
             // Swap currentMax and currentMin if num is negative
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp; }
            // Reset currentMax if starting fresh
            if (num > currentMax * num) {
                currentMax = num;
                tempStart = i; 
            } else {
                currentMax = currentMax * num; }
                currentMin = Math.min(num, currentMin * num);
            // Update maxProduct and index boundaries
            if (currentMax > maxProduct) {
                maxProduct = currentMax;
                start = tempStart;
                end = i;   }   }
        System.out.print("Maximum product subarray elements: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
         return maxProduct;
    }
}



