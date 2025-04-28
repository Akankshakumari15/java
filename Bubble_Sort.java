public class Bubble_Sort {
    public static void BubbleSort(int [] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int [] arr={2,3,4,2,0,6,12};
        BubbleSort(arr);



    }
}
