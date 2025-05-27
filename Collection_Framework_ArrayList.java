import java.util.ArrayList;
import java.util.Collections;

public class Collection_Framework_ArrayList {
    public static void main(String[] args) {
        //EX 1
    ArrayList <String> arr = new ArrayList<>();
        System.out.println("String array: ");
        //to add/assign elements into the array.
         arr.add("akanksha");
         arr.add("hi"); 
         arr.add("byeee");
         arr.add(0,"akuu");
         System.out.println(arr);
         Collections.sort(arr);System.out.println("After sorting:");
         System.out.println(arr);
          

         //EX 2
    ArrayList<Character> arr2 = new ArrayList<>();
        System.out.println("Character array:");
        //to add/assign elements into the array.
         arr2.add('d');
         arr2.add('e'); 
         arr2.add('a');
         arr2.add(0,'b');
         System.out.println(arr2);
         Collections.sort(arr2);System.out.println("After sorting:");
         System.out.println(arr2);

        //EX 3
    ArrayList<Integer> arr1 = new ArrayList<>();
    System.out.println("Integer array:");
         arr1.add(178);
         arr1.add(67); 
         arr1.add(24);
         arr1.add(0,298);
         System.out.println(arr1);
         
         //to get a certain index element from an array
         System.out.print("Getting element at index 2:");
         System.out.println(arr1.get(2));
         //to change an element existing in a array
         System.out.print("Setting element at index 3(46):");
         System.out.println(arr1.set(3, 46));
         System.out.println(arr1);
         //to remove an index element from the array
         System.out.print("Removing element at index 1 from the array:");
         System.out.println(arr1.remove(1));
         System.out.println(arr1);
         //to clear/delete the whole array
         System.out.print("After clearing the array:");
         arr1.clear();
         System.out.println(arr1+" ");






         

         


    }
    
}
