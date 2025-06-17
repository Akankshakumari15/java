public class CyclicallyRotateAnArrayByOne {

    public static void rotateByOne(int[] arr) {
        int n = arr.length;
        // Store the last element
        int last = arr[n - 1]; 

        // Shift elements one position to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Original array:");
        printArray(arr);

        rotateByOne(arr);

        System.out.println("Array after rotating by one position to the right:");
        printArray(arr);
    }
}


