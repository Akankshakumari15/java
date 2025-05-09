import java.util.Scanner;

public class Reverse_a_String {
    
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        int n=str.length();
        
        String rev="";
        sc.close();
       

        for(int i=n-1;i>=0;i--){
           rev= rev+str.charAt(i);
            }
        System.out.println(""+rev);

}
}
