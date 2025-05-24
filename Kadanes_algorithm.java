public class Kadanes_algorithm {
    public static void main(String[] args) {
        
     try {
      int [] arr={2,4,3,56,6,4,-2,-4};
        int sum=0;int max =arr[0]; int a=0; 
            for(int i=0;i<(arr.length-2);i++){
            sum=arr[i]+arr[i+1]+arr[i+2];
            if(sum>max){
                max=sum;
                a=i;
              }
            } 
            System.out.println("The sum is:"+max);    
             System.out.println("The elements that form the maximum subarray are:"+arr[a]+","+arr[a+1]+","+arr[a+2]);     
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("No maximum subarray found.");
        }

    }
          
}
