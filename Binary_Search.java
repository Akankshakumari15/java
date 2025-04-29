public class Binary_Search {
    public static int BinarySearch(int [] arr,int target){
      int left=0;
      int right=arr.length-1;
      while(left<=right)
      {
         int mid=(left+right)/2;
      
      if(arr[mid]==target){
        return mid;
      }  
      else if(arr[mid]>target){
          right=mid-1;
      }
      else{
         left=mid+1;
      }

      }
      return -1;
}

public static void main(String[] args) {
    int [] arr={21,33,45,78,78,99};
    int target =78;
    int result =BinarySearch(arr,target);

    if (result==-1){
        System.out.println("Element not found");
    }
    else{
        System.out.println("Element found at index: "+result );
    }

     
}}
