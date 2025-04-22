import java.util.Scanner;

public class String_Match {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String str1 = sc.next();
        System.out.println("Enter 2nd string:");
        String str2 = sc.next();
        sc.close();

        boolean isMatch=true;
        
        if(str1.length()!=str2.length()){
            isMatch=false;
        }
            
        else{
            for(int i=0;i<str1.length();i++){
                if(str1.charAt(i)!=str2.charAt(i)){
                isMatch=false;
                break;
                }

            }
        }

        if(isMatch){
            System.out.println("Strings are matching");
        }
        else{
            System.out.println("Strings are not matching");
        }
        

        
        

        
    
    }
}
