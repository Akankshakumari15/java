public class String_Null_Exception_Handling {
    public static void main(String[] args) {
        String str ="hi";
        String str1 =null;

        try {
            System.out.println(str.toUpperCase());
            System.out.println(str1.toUpperCase());
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println("Caught a null pointer exception!");
        }
    }
}
