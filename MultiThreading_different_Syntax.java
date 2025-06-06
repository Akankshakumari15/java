public class MultiThreading_different_Syntax {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println("End");
    });
    t1.start();

        Thread t2=new Thread(()->{
        System.out.println("Hi");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }
        System.out.println("Endlesssss");
    });
    t2.start();
}
}