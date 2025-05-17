import java.util.Scanner;

public class Union_and_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first array
        System.out.println("Enter size of first array:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for second array
        System.out.println("Enter size of second array:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }

        sc.close();

        // INTERSECTION (no duplicates)
        System.out.println("Intersection elements:");
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    // check if already printed
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (arr1[k] == arr1[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.print(arr1[i] + " ");
                    }
                    break;
                }
            }
        }
        System.out.println();

        // UNION (no duplicates)
        System.out.println("Union elements:");
        int[] union = new int[size1 + size2];
        int index = 0;

        // Add all elements of arr1 to union
        for (int i = 0; i < size1; i++) {
            boolean alreadyExists = false;
            for (int j = 0; j < index; j++) {
                if (union[j] == arr1[i]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                union[index++] = arr1[i];
            }
        }

        // Add elements from arr2 (only if not already in union)
        for (int i = 0; i < size2; i++) {
            boolean alreadyExists = false;
            for (int j = 0; j < index; j++) {
                if (union[j] == arr2[i]) {
                    alreadyExists = true;
                    break;
                }
            }
            if (!alreadyExists) {
                union[index++] = arr2[i];
            }
        }

        // Print union array
        for (int i = 0; i < index; i++) {
            System.out.print(union[i] + " ");
        }

        System.out.println();
    }
}
