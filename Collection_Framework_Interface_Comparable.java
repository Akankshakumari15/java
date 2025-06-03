//is sorting by age

import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }

    //Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

public class Collection_Framework_Interface_Comparable {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student(12, "rahul"));
        list1.add(new Student(18, "akuu"));
        list1.add(new Student(20, "prerna"));
        Collections.sort(list1);
        for (Student s : list1) {
            System.out.println(s.toString());
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(0);
        list.add(4);
        list.add(1);
        Collections.sort(list);
        System.out.println(list);
    }
}


