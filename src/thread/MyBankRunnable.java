package thread;

public class MyBankRunnable implements Runnable{
    private BankAccount account;

    public MyBankRunnable(BankAccount acount) {
        this.account = acount;
    }

    @Override
    public void run() {
        for(int i=0; i<20; i++) {
            try {
                Thread.sleep(1);
                System.out.printf("[%s]출금전 잔액 : %d\n", Thread.currentThread().getName(), account.getBalance());
                account.withdraw(200);
                System.out.printf("[%s]출금후 잔액 : %d\n", Thread.currentThread().getName(), account.getBalance());

            } catch (InterruptedException e) {
                System.out.println( e.getMessage() );
            }
        }
    }
}
