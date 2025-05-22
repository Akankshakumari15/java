//multiple inheritance can be implemented in java using interfaces.

interface walkable {
    abstract void run();
    abstract void walk();
}
interface runnable {
    abstract void run();
    abstract void walk();
}
class Human implements walkable,runnable{
        public void run(){
               System.out.println("I am walking.");
        }
        public void walk(){
               System.out.println("I am running.");
        }

    }
public class Interface_Walkable_Runnable {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.walk();
        obj.run();
    }
    
}
