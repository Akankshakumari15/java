import java.util.Scanner;

class Parent {
    void printName(String name) {
        System.out.println(name);
    }

    void printRollNo(int rollNo) {
        System.out.println(rollNo);
    }
}

public class Method_Overloading_String_Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = sc.next();  // Reads a single word

        System.out.println("Enter roll number:");
        int rollNo = sc.nextInt();  // Reads an integer

        sc.close();

        Parent obj = new Parent();
        obj.printName(name);  // Calls printName method
        obj.printRollNo(rollNo);  // Calls printRollNo method
    }
}

