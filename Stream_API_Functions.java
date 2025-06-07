import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_API_Functions {
    public static void main(String[] args) {
        // first , find max integers than 2, even out of them, and find sum .
         List<Integer> list = Arrays.asList(2,4,6,5,8,9,1,10,14,13);

           int sum = list.stream()
                                     .filter(n -> n>2) 
                                     .filter(n->n%2==0) 
                                     .reduce(0,(a,b)->a+b);
                                     
       System.out.println("Sum of even numbers greater than 2: "+sum); 
        

       //find maximum element in the list
        List<Integer> list1 = Arrays.asList(2,4,6,5,8,9,1,10,14,13);

        int max =list1.stream()
                               .reduce(0,(a,b)->a>b?a:b);
        System.out.println("Maximum element: "+max);


        //to find minimum value in the list
        int min = list1.stream()
                                .reduce(Integer.MAX_VALUE, (a,b)->a<b?a:b);
        System.out.println("Minimum element: "+min);    
        
        
        //to find second maximum in the list
         int second_max =list1.stream()
                            .filter(n->n!=max)
                            .reduce(0,(a,b)->a>b?a:b);
        System.out.println("Second maximum: "+second_max);
    }
    
}
