class Hello {
    String name = "raj";

    // Default constructor
    Hello() {
        System.out.println("hello");
    }

    // Parameterized constructor
    Hello(String name) {
        this.name = name;
        System.out.println("Name set to: " + this.name);
    }

    void hi() {
        System.out.println("hi");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Hello obj = new Hello();               // Calls default constructor
        obj.hi();                              // Calls method

        Hello obj1 = new Hello("Amit");        // Calls parameterized constructor
        obj1.hi();                             // Also works on second object
    }
}
