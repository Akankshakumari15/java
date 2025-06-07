import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda_expression {
    public static void main(String[] args) {

        //EX 1
        // Runnable r = new Runnable() {
        //     public void run() {
        //         System.out.println("hi");  
        //     }
        // };
        // Thread t = new Thread(r);
        // t.start();
        
        
        //lambda expression
        Runnable r = ()->System.out.println("Runnable in lambda.");
        r.run();

     //EX 2 -> sort according to alphabetical order
    ArrayList <String> list1 = new ArrayList<>();
      list1.add("akuu");
      list1.add("teja");
      list1.add("anjali");
      list1.add("prerna");
      list1.add("shreya");
    //   Collections.sort(list1, new Comparator<String>() {
    //     public int compare(String a,String b){
    //         return a.compareTo(b);
    //     }
    //  });


    //lambda expression
     Collections.sort(list1, (a,b)->a.compareTo(b));
     System.out.println(list1);


     //EX 3 -> multiply 5 to all even numbers
        List<Integer> list = Arrays.asList(5,10,15,20,25);

        List<Integer> evenList = list.stream()
                                     .filter(n -> n % 2 == 0) // Keep only even numbers
                                     .map(n -> n *5) //to multiply 5 to all numbers
                                     .collect(Collectors.toList());
       System.out.println(evenList); 
       
       
    //EX 4 -> sum of all integers of the list
    int sum=list.stream()
                .reduce(10,(a,b)->a+b);//a=0,b=5
                                
    System.out.println(sum);                            


    //EX 5 -> sum of all even integers of list
    int evenSum = list.stream()
                  .filter(n -> n % 2 == 0)
                  .reduce(0, Integer::sum);

    System.out.println(evenSum);

    }
}

    

