import java.util.Scanner;

public class Multiply_twoD_matrix_array {
public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         //1st array
         System.out.println("Enter no of rows and columns for the first array:");
         int rows1 = sc.nextInt();
         int cols1 = sc.nextInt();
         int [][] arr1= new int[rows1][cols1];
        

         //input for 1st array
         System.out.println("Enter elements in the 2D array:");
         for(int i=0; i<rows1;i++){
            for(int j=0;j<cols1;j++){
                arr1[i][j]= sc.nextInt();
            }
         }

         //Second array
         System.out.println("Enter no of rows and columns for the second array:");
         int rows2 = sc.nextInt();
         int cols2 = sc.nextInt();
         int [][] arr2= new int[rows2][cols2];
    
         //input for 2nd array
         System.out.println("Enter elements in the 2D array:");
         for(int i=0; i<rows2;i++){
            for(int j=0;j<cols2;j++){
                arr2[i][j]= sc.nextInt();
            }
         }

           //result array
           int [][] result= new int[arr1.length][arr2[0].length];
         
         sc.close();
        
         //output
         for(int i=0; i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k= 0; k<arr1[0].length;k++){
                    result [i][j]+= arr1[i][k]*arr2[k][j];
                    
            }
            System.out.println(result[i][j]+" ");
        }
      }
                    
    }
}

