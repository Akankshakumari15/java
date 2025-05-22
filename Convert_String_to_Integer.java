public class Convert_String_to_Integer {
    public static void main(String[] args) {
        String str = "atoi";
        int n=0;
        for (int i = 0; i < str.length(); i++) {
            n=n*10+(str.charAt(i)-'0');
        }
        System.out.println(n);
    }
}
