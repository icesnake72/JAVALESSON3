package thread;

public class BankAccount {
    private int balance;
    public BankAccount() {
        balance = 1000;
    }

    public synchronized void withdraw(int amount) {
        if ( balance >= amount ) {
            System.out.printf("[%s]출금전 잔액 : %d\n", Thread.currentThread().getName(), balance);
            balance -= amount;
            System.out.printf("[%s]출금후 잔액 : %d\n", Thread.currentThread().getName(), balance);

        } else {
            System.out.println("잔액 부족");
        }
    }

    public int getBalance() {
        return balance;
    }
}
