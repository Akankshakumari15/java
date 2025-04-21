import java.util.Scanner;

public class Sum_of_Elements_of_Matrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //1st array
         System.out.println("Enter no of rows and columns in the array:");
         int rows = sc.nextInt();
         int cols = sc.nextInt();
         int [][] arr= new int[rows][cols];
         
         //input
         System.out.println("Enter elements in the 2D array:");
         for(int i=0; i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]= sc.nextInt();
            }
         }


         sc.close();
         
         
         //output
         int sum=0;
         for(int i =0; i<rows;i++){
            for(int j=0; j<cols;j++){
                sum+=arr[i][j];
            }
         }
         System.out.println("Total sum:"+sum);

    }
}
