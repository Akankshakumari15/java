import java.util.TreeSet;

public class Finding_Duplicate_using_TreeSet {
    public static void main(String[] args) {
       
        TreeSet<Integer> set = new TreeSet<>();
         int [] arr={1,2,55,4,2,4,55,65,72};
         int count=0;
         for(int i=0 ; i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Duplicate numbers:"+arr[i]);
                count++;
                //break;
            }
            set.add(arr[i]);
        }

        //  for(int i=0 ; i<arr.length;i++){
        //    set.add(arr[i]);
        // }
         System.out.println(set);
         System.out.println(count);
       
    }
    
}
