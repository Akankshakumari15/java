//asynchronous behaviour of running a code is more time optisized.
//multithreading also works in an asynchromous behaviour.
//here we have two threads i.e main(byDefault) and myThread(userMade).
//In any case, first the main thread will execute itself and then the userMade thread. 
//So this is the reason why first "hi" gets printed and then "hello".


class myThread extends Thread{
      public void run(){
      System.out.println("hello");
      System.out.println("hi");

      try {
        Thread.sleep(2000);
      } catch (Exception e) {
      }
      System.out.println("byee");
      }
      
 }
public class MultiThreading {
    public static void main(String[] args) {
    myThread t1 = new myThread();
    t1.start();
    //System.out.println("hi");
        
   }
}
