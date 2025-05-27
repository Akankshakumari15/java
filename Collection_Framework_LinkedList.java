
import java.util.LinkedList;

public class Collection_Framework_LinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> arr  = new LinkedList<>();
        long start = System.nanoTime();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        System.out.println(arr);
        System.out.println(arr.contains(10));
        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
