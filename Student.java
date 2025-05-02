
import java.util.Scanner;

public class Student {
    // Instance variables
    private String name;
    private int rollNumber;
    private int marks;
    private String fathersName;
    private String mothersName;

    // Method to set student data
    public void setData(String name, int rollNumber, int marks, String fathersName, String mothersName) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
    }

    // Method to display student data
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Father's Name: " + fathersName);
        System.out.println("Mother's Name: " + mothersName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter father's name: ");
        String fathersName = sc.nextLine();

        System.out.print("Enter mother's name: ");
        String mothersName = sc.nextLine();

        sc.close();

        // Set and display data
        student.setData(name, rollNumber, marks, fathersName, mothersName);
        student.display();
    }
}

