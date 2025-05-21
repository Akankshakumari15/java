interface client {
    abstract void print(); //optional to write abstract , if not written it will still be considered so.
             void show();
}

class developer implements client{
    //writing public is compulsory
   public void print(){
        System.out.println("Akanksha");
   }

   public void show(){
        System.out.println("hello");
   }
}
public class Interface {
    public static void main(String[] args) {
        developer obj = new developer();
        obj.print();
        obj.show();
    }
}
