interface A{
    abstract void display();
}
interface B{
    abstract void display();

}
class Demo implements A,B{
    public void display(){
        System.out.println("A works with B.");
    }
}


public class Interface_A_B {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.display();
    }
}
