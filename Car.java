import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    private int price;


    public void setData(String brand, String model, int price ){
       this.brand =  brand;
       this.model = model;
       this.price = price;
    }

    public void display(){
        System.out.println("Brand name of car: "+brand);
        System.out.println("Model of car: "+model);
        System.out.println("Price of car: "+price);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brand of car:");
        String brand = sc.next();

        System.out.println("Enter model of car: ");
        String model = sc.next();

        System.out.println("Enter price of the car: ");
        int price = sc.nextInt();

        sc.close();

        Car car = new Car();
        
        car.setData(brand,model,price);
        car.display();
        
    }
}
