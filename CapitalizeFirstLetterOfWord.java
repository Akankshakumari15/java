public class CapitalizeFirstLetterOfWord{
    public static void main(String[] args) {
        String str = "the sun is shining bright today";
        String result = capitalizeWords(str);
        System.out.println(result);
    }

    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0)
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1)).append(" ");
        }

        return sb.toString().trim();
    }
}


