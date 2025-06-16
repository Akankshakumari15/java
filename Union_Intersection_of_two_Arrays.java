
    import java.util.Arrays;
public class Union_Intersection_of_two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 36, 4, 42};
        int[] arr2 = {1, 51, 36, 72, 45};
        // INTERSECTION
        System.out.println("Intersection:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
        //sorting the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // UNION
        System.out.println("Union:");
        // all elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        // elements from arr2 that are NOT already in arr1
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}

