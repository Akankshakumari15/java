import java.util.HashSet;
import java.util.TreeSet;

public class Collection_Framework_HashSet {
    public static void main(String[] args) {
        //EX 1
        HashSet  <Integer> set  = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(2);
        System.out.println(set);
        

        //EX 2
        HashSet  <Character> set1  = new HashSet<>();
        set1.add('A');
        set1.add('C');
        set1.add('D');
        set1.add('D');
        set1.add('e');
        System.out.println(set1);

        TreeSet  <Character> set4  = new TreeSet<>();
        set4.add('A');
        set4.add('C');
        set4.add('D');
        set4.add('D');
        set4.add('e');
        System.out.println(set4);


        //EX 3
        TreeSet  <String> set2  = new TreeSet<>();
        set2.add("A");
        set2.add("C");
        set2.add("b");
        set2.add("B");
        System.out.println(set2);        
    }
    
}
