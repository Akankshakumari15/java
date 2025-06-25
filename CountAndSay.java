public class CountAndSay {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n <= 0) return "";
        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            char num = result.charAt(0);
            int count = 1;

            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == num) {
                    count++;
                } else {
                    sb.append(count).append(num);
                    num = result.charAt(j);
                    count = 1;
                }
            }
            sb.append(count).append(num); // append last counted group
            result = sb.toString();       // update result for next iteration
        }
      return result;
    }
}
