public class Compress_the_String {
    public static void main(String[] args) {
        String str = "aaabbccdddd"; // Expected output: a3b2c2d4
        StringBuilder newStr = new StringBuilder();
        int count = 1;

        // Iterate through the string starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // Check if the current character is different from the previous one
            if (str.charAt(i) != str.charAt(i - 1)) {
                // Append the previous character and its count to the result
                newStr.append(str.charAt(i - 1)).append(count);
                count = 1; // Reset count for the new character
            } else {
                count++; // Increment count for the current character
            }
        }

        // Append the last character and its count
        newStr.append(str.charAt(str.length() - 1)).append(count);

        // Output the compressed string
        System.out.println(newStr.toString());
    }
}

