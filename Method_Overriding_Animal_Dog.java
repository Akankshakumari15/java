class Animal{
    void sound(){
        System.out.println("meow...meow");
    }

}

class Dog extends Animal{
    void sound(){
        System.out.println("bhow!!!!bhow!!!");
        super.sound();
    }
}
public class Method_Overriding_Animal_Dog {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        
        


    }
    
}
