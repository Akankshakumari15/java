import java.util.Scanner;

public class Count_Vowel_Consonant_in_String {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        sc.close();

        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' || str.charAt(i)=='A' ||str.charAt(i)=='E' ||str.charAt(i)=='I' ||str.charAt(i)=='O' ||str.charAt(i)=='U' )
                vowelcount++;
            else
                consonantcount++;
                    
       
        }
        System.out.println("No. of vowels: "+vowelcount);
        System.out.println("No. of consonants: "+consonantcount);
    }
}
