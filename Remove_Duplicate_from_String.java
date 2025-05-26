import java.util.*;

public class Remove_Duplicate_from_String {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        // input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        String newStr ="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(newStr.indexOf(ch)==-1){
                newStr=newStr+ch;
            }
        }
        System.out.println(newStr+" ");
   }
}


