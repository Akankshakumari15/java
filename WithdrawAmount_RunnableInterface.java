class amount implements Runnable {
    int withdrawalAmount;
    static int balance = 1000;
    //constructor
    public amount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void run() {
     synchronized (amount.class) {
        if (balance < withdrawalAmount) {
            System.out.println(Thread.currentThread().getName() + ": Insufficient balance");
        } else {
            System.out.println(Thread.currentThread().getName() + ": Processing withdrawal...");
            try {
                Thread.sleep(2000); 
            } catch (Exception e) {
                e.printStackTrace();
            }
            balance = balance - withdrawalAmount;
            System.out.println(Thread.currentThread().getName() + ": Withdrawal of " + withdrawalAmount + " successful. Remaining balance: " + balance);
        }
    }
  }
}

public class WithdrawAmount_RunnableInterface {
    public static void main(String[] args) {
        amount obj1 = new amount(800);
        amount obj2 = new amount(500);

        Thread d1 = new Thread(obj1, "Thread-1");
        Thread d2 = new Thread(obj2, "Thread-2");

        d1.start();
        d2.start();
    }
}
