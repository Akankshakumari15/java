import java.util.Scanner;

public class Check_if_String_is_Palindrome {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        int n=str.length();
        
        String rev="";
        sc.close();
       

        for(int i=n-1;i>=0;i--){
           rev= rev+str.charAt(i);
            }
        System.out.println(""+rev);

       for(int i=0;i<str.length();i++){
             if(str.charAt(i)==rev.charAt(i)){
                   System.out.println("palindrome");
                   break;
        }
            else{
                System.out.println("not a palindrome");
                break;
            }
        }
    }
    }


    

