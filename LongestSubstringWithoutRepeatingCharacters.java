
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    
    public static void main(String[] args) {
        String s = "abcdaabcdbbd";
        HashSet<Character> set = new HashSet<>();
        int max = 0, left = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if (right - left + 1 > max) {
                max = right - left + 1;
                start = left;
            }
        }

        System.out.println("Length of longest substring: " + max);
        System.out.println("Longest substring: " + s.substring(start, start + max));
    }
}



