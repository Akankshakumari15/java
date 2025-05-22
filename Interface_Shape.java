import java.util.Scanner;

interface Shape{
    abstract void area();
}
class  Circle implements Shape{
    public void area(){
      System.out.println("Enter the value of radius");
      Scanner sc =  new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        System.out.println("the value of radius is "+r);
      double Area = Math.PI*r*r;
      System.out.println(Area);
    }

}
public class Interface_Shape {
    public static void main(String[] args) {
         Circle circle = new Circle();
        circle.area();
    }
}
