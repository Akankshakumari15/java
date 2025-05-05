import java.util.Scanner;

public class Circle {
    private double radius;

    public void setData(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }    
        
    
    public double area_of_circle() {
            return Math.PI*radius*radius;
        }
    
       
    public double perimeter_of_circle() {
            return 2*Math.PI*radius;
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();


        sc.close();

        circle.setData(radius);

        double area = circle.area_of_circle();
        double perimeter = circle.perimeter_of_circle();

        System.out.printf("Area of Circle: %.2f%n", area);
        System.out.printf("Perimeter of Circle: %.2f%n",perimeter);

    }
}



    

