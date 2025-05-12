class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {
    void calculateArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class Shape_Circle_Single_Level_Inheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.calculateArea(5.0); // example radius
    }
}
