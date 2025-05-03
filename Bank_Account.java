import java.util.Scanner;

public class Bank_Account {
    private int accountNumber;
    private String accountHolder;
    private int balance;

    public void setData(int accountNumber, String accountHolder, int balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void display(){
        System.out.println("Name of account holder: " + accountHolder);
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdrawal(int amount){
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Account bankAccount = new Bank_Account();

        System.out.print("Enter account holder's name: ");
        String accountHolder = sc.next();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        bankAccount.setData(accountNumber, accountHolder, balance);

        System.out.print("Enter deposit amount: ");
        int depositAmount = sc.nextInt();
        bankAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        int withdrawalAmount = sc.nextInt();
        bankAccount.withdrawal(withdrawalAmount);

        sc.close();

        bankAccount.display();
    }
}
