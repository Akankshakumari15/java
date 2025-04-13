import java.util.Scanner;

public class Float_to_Int_Type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        float floatValue= sc.nextFloat();
        sc.close();
        
        //float floatValue = 10.75f;

        int intValue = (int) floatValue;

        System.out.println("Float value:" +floatValue);

        System.out.println("Int value:" +intValue);
    }
    
}
