public class Exception_Handling {
    public static void main(String[] args) {
        int a=18;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("we cannot divide by zero.");
        }
        System.out.println("hello");
        System.out.println("hi");
        System.out.println("byee");
    }
}
