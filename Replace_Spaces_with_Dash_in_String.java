import java.util.Scanner;

public class Replace_Spaces_with_Dash_in_String {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();
        sc.close();
        String result="";
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                result+="-";
            }
            else{
                result+=c;
            }

        }
        System.out.println(result);
    }
    
}
