import java.util.Scanner;

class Parent {
     void printName(String name) {
        System.out.println(name);
    }

     int printSquareOfInteger(int n) {
        return n*n;
    }
}



public class Method_Overloading_String_Int_square {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // Input for name
        System.out.println("Enter name:");
        String name = sc.nextLine();  // Reads a full line


        System.out.println("Enter an integer:");
        int n = sc.nextInt();  // Reads an integer

        sc.close();

        Parent obj = new Parent();
        obj.printName(name);  // Calls printName method
        int square = obj.printSquareOfInteger(n);  // Calls printSquareOfInteger method
        System.out.println("Square of the integer: " + square);
    }
}

