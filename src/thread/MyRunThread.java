package thread;

public class MyRunThread implements Runnable {
    private String name;

    public MyRunThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<20; i++) {
            System.out.printf("[%s] : %d\n", name, i);

            try {
                Thread.sleep(1); // 1/1000초
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
