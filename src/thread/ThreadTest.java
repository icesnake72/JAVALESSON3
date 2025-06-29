package thread;

import java.util.Scanner;

public class ThreadTest {
    public static void exceptionTest() {
        // 예외(Exception) 처리
        int [] arr = {1,2,3};
//        System.out.println(arr[3]);
        // ...
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수를 입력하세요 : ");
            int number = sc.nextInt();
            System.out.println( "입력된 값 : " + number );

            System.out.println(10 / 0); // 잘 못해서 분모에 0이 들어가도록 실수...
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( e.getMessage() );   // ArrayIndexOutOfBoundsException의 기본 메시지
        } catch (ArithmeticException e) {
            System.out.println( "0으로 나눌 수 없습니다." ); // 개발자 커스텀 메시지를 출력
        } catch (Exception e) {
            System.out.println( "알 수 없는 에러가 발생했습니다." ); // 개발자 커스텀 메시지를 출력
        } finally {
            // try를 진입하면 무조건 마지막에 실행되는 블록
            try {
                sc.close();
            } catch (Exception e) {
                System.out.println("");
            }
        }
    }

    public static void main(String[] args) {
//        exceptionTest();

        MyThread th1 = new MyThread("서브 스레드1");
        MyThread th2 = new MyThread("서브 스레드2");

        // Runnable interface를 구현한 클래스를 인스턴스로 생성함
        // MyRunThread rt = new MyRunThread("서브 스레드3");
        Thread th3 = new Thread( new MyRunThread("서브 스레드3") );
        Thread th4 = new Thread(new Runnable() {
            private final String name = "서브 스레드4";
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
        });

        Thread th5 = new Thread(() -> {
            for(int i=0; i<20; i++) {
                System.out.printf("[%s] : %d\n", "서브 스레드5", i);

                try {
                    Thread.sleep(100); // 1/1000초
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        th1.start();    // thread를 시작시키는 메소드 ===> run()메소드가 자동으로 실행됨
        th2.start();
        th3.start();
        th4.start();
        th5.start();

        for(int i=0; i<20; i++) {
            System.out.printf("[메인 스레드] : %d\n", i);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        try {
            th1.join();
            th2.join();
            th3.join();
            th4.join();
            th5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("프로그램 정상 종료됨");
    }
}
