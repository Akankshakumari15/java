public class ValidPalindromeAfterAtmostOneDeletion {
     public static void main(String[] args) {
        String word = "madame";
        boolean result = canBecomePalindrome(word);
        System.out.println(result); // true
    }
     public static boolean canBecomePalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
              return checkPalindrome(word,start + 1,end) || checkPalindrome(word,start,end - 1);
            }
            start++;
            end--;
        }
        return true; 
    }
    public static boolean checkPalindrome(String word, int start, int end) {
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }}


