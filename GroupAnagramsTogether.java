
import java.util.*;
public class GroupAnagramsTogether {
    public static void main(String[] args) {
        String[] input = {"listen", "silent", "enlist", "rat", "tar", "art", "god", "dog"};

        List<List<String>> groupedAnagrams = groupAnagrams(input);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
public static List<List<String>> groupAnagrams(String[] inputWords) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String original : inputWords) {
            char[] tempArr = original.toCharArray();
            Arrays.sort(tempArr);
            String sortedForm = new String(tempArr);

            if (!anagramMap.containsKey(sortedForm)) {
                anagramMap.put(sortedForm, new ArrayList<>());
            }

            anagramMap.get(sortedForm).add(original);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
