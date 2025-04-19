public class Merge_Two_Arrays {

    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5};
        int [] arr2= {2,4,3,45,6};
        int [] merged_arr= new int[arr1.length+arr2.length];
       
        for(int i=0;i<arr1.length;i++){
            merged_arr[i]=arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            merged_arr[arr1.length+i]=arr2[i];
        }

        System.out.println("Merged array:");{
            for(int i=0;i<merged_arr.length;i++){
                System.out.println(merged_arr[i]+ " ");
            }
        }

    }
    
}
