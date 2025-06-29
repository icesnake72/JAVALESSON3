package thread;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();


        // task : Runnable 인터페이스를 구현하는 익명 클래스로부터 생성한 인스턴스이다.
        // Runnable 인터페이스는 Functional Interface이기 때문에 재정의할 메소드가 run()밖에 없다.
        // 따라서 task에 할당되는 메소드는 자동으로 run()메소드가 된다.
        Runnable task = () -> {
            for(int i=0; i<20; i++) {
                try {
                    Thread.sleep(1);
                    account.withdraw(200);
                } catch (InterruptedException e) {
                    System.out.println( e.getMessage() );
                }
            }
        };

        Thread th1 = new Thread(task, "뱅크 스레드1");
        Thread th2 = new Thread(task, "뱅크 스레드2");

        th1.start();
        th2.start();
    }
}
