import java.util.Scanner;

public class Vowel_Consonant_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a character:");
        char ch = sc.next().charAt(0);
        sc.close();

        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E': 
            case 'I':
            case 'O':
            case 'U':System.out.println("VOWEL");
                     break;
            default:System.out.println("CONSONANT");
                     break;
        }

    }
    
}
