import java.util.Scanner;

public class Alphabets_triangle {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input no of rows:");
        int rows = sc.nextInt();
        char alphabet = 'A';

        sc.close();

    for(int i= 0; i < rows; i++){
            //print spaces
        for(int j= 0;j< rows-i-1 ;j++){
            System.out.print(" ");
            
        }
        //print alphabets

        for(int k=0;k<=i;k++){
            System.out.print(alphabet +" ");
            alphabet++;
        }
        System.out.println();
        
        }
    }
}
    

