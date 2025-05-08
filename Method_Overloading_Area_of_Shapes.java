class Shape{
    void Rectangle(int length,int breadth){
         System.out.println(length*breadth);
    }

    void Circle(double radius){
        System.out.println(Math.PI*radius*radius);
    }

    void Square(int side){
        System.out.println(side*side);
    }

    void Triangle(float base, float height ){
        System.out.println(base*height/2);
    }
}



public class Method_Overloading_Area_of_Shapes {
public static void main(String[] args) {
    Shape obj = new Shape();
    obj.Rectangle(2, 5);
    obj.Circle(36.55);
    obj.Square(5);
    obj.Triangle(2.3747889f, 6798043.56766778f);
}
    
}
