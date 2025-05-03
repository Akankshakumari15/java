
    import java.util.Scanner;

public class Rectangle {
    private int length;
    private int breadth;

    public void setData(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area_of_rectangle() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        sc.close();

        rectangle.setData(length, breadth);

        int area = rectangle.area_of_rectangle();
        int perimeter = rectangle.perimeter();

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}


