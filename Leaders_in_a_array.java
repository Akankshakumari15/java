import java.util.Scanner;

public class Leaders_in_a_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");   
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements in the array:");   
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        for (int i=0;i<arr.length;i++){
            int current = arr[i];
            boolean isLeader = true;
            for(int j=i+1;j<arr.length;j++){
                if(current<arr[j]){
                    isLeader=false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println(current+" is a leader.");
            }
        }
    }
    
}

    

