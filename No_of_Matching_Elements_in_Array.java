import java.util.Scanner;

public class No_of_Matching_Elements_in_Array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int size1  = sc.nextInt();
        System.out.println("Enter size of second array:");
        int size2 = sc.nextInt();
        int [] arr1 = new int[size1];
        int [] arr2 = new int[size2];
        

        System.out.println("Enter elements of first array:");
           
        for(int i=0;i<=size1-1;i++){
            arr1[i]= sc.nextInt();
           }
        System.out.println("Enter elements of second array:");
           
           for(int j=0;j<=size2-1;j++){
            arr2[j]= sc.nextInt();
           }

           sc.close();
    
     int matchCount=0;
     int notAmatchCount=0;
    for(int k=0;k<=size2-1;k++){
        if(arr1[k]==arr2[k]){
              matchCount++;
         }
    else{
         notAmatchCount++;
    }
    
}

System.out.println("No of matching elements: "+matchCount);
System.out.println("No of elements that do not match: "+notAmatchCount);
}
}

