public class CapitalizeFirstLetterOfWord{
    public static void main(String[] args) {
        String str = "the sun is shining bright today.";
        System.out.println(capitalizeWords(str));
    }

    public static String capitalizeWords(String str) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
                result.append(ch);
            } else if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}


