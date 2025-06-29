
import java.util.HashMap;
import java.util.Map;
public class OccurencesOfAnElementInMatrix {
   public static void main(String[] args) {
     int[][] matrix = {
            {1, 5, 3},
            {6, 3, 3},
            {6, 5, 6}
        };

     Map<Integer, Integer> frequencyMap = countAllOccurrences(matrix);

     for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println( entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
  public static Map<Integer, Integer> countAllOccurrences(int[][] matrix) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
       return map;
    }
}

