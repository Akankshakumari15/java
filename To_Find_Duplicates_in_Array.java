public class To_Find_Duplicates_in_Array {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 4, 8, 2, 9};

        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    // To avoid printing duplicates multiple times
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (numbers[k] == numbers[i]) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.println(numbers[i]);
                    }
                    break; // optional: remove to find all duplicates
                }
            }
        }
    }
    
}
