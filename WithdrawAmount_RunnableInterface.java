class amount implements Runnable{
    int withdrawalAmount;
    static int balance=1000;

    public  amount(int withdrawalAmount){
        this.withdrawalAmount=withdrawalAmount;
    }
  public void run(){
  
    if(balance<withdrawalAmount){
        System.out.println("Insufficient amount balance");
    }
    else{
        balance=balance-withdrawalAmount;
        System.out.println("Amount "+withdrawalAmount+" has been withdrawn.");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    System.out.println("Present bank balance :"+balance);
}
}
public class WithdrawAmount_RunnableInterface {
    
    public static void main(String[] args) {
        amount obj = new amount(800);
        Thread d1 = new Thread(obj);
        amount obj1 = new amount(500);
        Thread d2 = new Thread(obj1);
        d1.start();
        try {
            d1.join();
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        d2.start();
        
    }
}
