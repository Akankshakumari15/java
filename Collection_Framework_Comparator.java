//is sorting by name,age,roll_no with the help of inteface and package comparator

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student{
    int roll_no;
    int age;
    String name;

     student(int age,int roll_no, String name){
        this.age = age;
        this.name = name;
        this.roll_no=roll_no;
     }
       public String toString() {
        return age + " " + name+" "+roll_no;
    }
}
class sort_by_name implements Comparator<student>{
    public int compare(student s1 , student s2){
        return s1.name.compareTo(s2.name);
    }
    
}
class sort_by_age implements Comparator<student>{
    public int compare(student s1 , student s2){
        return s1.age-s2.age;
    }
    
}
class sort_by_roll_no implements Comparator<student>{
    public int compare(student s1 , student s2){
        return s1.roll_no-s2.roll_no;
    }
    
}


public class Collection_Framework_Comparator {
    public static void main(String[] args) {
        ArrayList <student> list = new ArrayList<>();
        list.add(new student(12, 10026, "akuu"));
        list.add(new student(15, 10027, "anu"));
        list.add(new student(17, 10015, "shivangi"));
        list.add(new student(20, 10020, "priyam"));
        list.add(new student(21, 10030, "ayushi"));
        System.out.println("Sorted by name: ");
        Collections.sort(list, new sort_by_name());
        for (student s : list) {
            System.out.println(s.toString());
        }
        System.out.println("Sorted by age: ");
        Collections.sort(list, new sort_by_age());
         for (student s : list) {
            System.out.println(s.toString());
        }
        System.out.println("Sorted by roll_no: ");
        Collections.sort(list, new sort_by_roll_no());
         for (student s : list) {
            System.out.println(s.toString());
        }
    
  }
}
