package cls;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.deposit(1000);
        bank.withdraw(2000);
        bank.withdraw(1000);
    }
}
