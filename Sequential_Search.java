public class Sequential_Search {
    public static int SequentialSearch(int[] arr,int target){

        for(int i=0;i<arr.length;i++){
            if(target==arr[i])
           return i;
           
         }
         return -2;

        }

    

    public static void main(String[] args) {
        int [] arr={1,3,5,7,8,9};
        int target =7;
        int result =SequentialSearch(arr,target);

        if (result==-2){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: "+result );
        }

         
    }
    
}
