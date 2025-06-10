public class Intersection_of_two_sorted_arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.println("Intersection of the two sorted arrays:");
        findIntersection(arr1, arr2);
    }

    static void findIntersection(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                // Both elements are same
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }
}



