interface Vehicle{
    default void start(){
        System.out.println("Vehicle is starting.");
    }
}

 class Car implements Vehicle{
   
}


public class Interface_Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();

    }
}
