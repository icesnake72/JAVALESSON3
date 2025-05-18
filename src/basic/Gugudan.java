package basic;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
//        // 사용자에게 단수를 입력받아서 해당 단수 구구단을 출력하는 코드를 작성하세요
//        System.out.print("단수를 입력하세요 >>> ");
//        Scanner sc = new Scanner(System.in);
//
//        int dan = sc.nextInt(); // 정수를 입력받음
//        int n = 1;
//        while ( n < 10 ) {
//            System.out.printf("%d X %d = %d\n", dan, n, dan*n);
//            n++;
//        }
//
//        sc.close();

        // 사용자가 0을 입력할때까지 사용자로부터 단수를 입력받아서
        // 해당 단수를 출력하는 구구단 코드를 작성하세요
        /*
        * 단수를 입력하세요 >>> 3
        * 3 x 1 = 3
        * 3 x 2 = 6
        * ..
        * 3 x 9 = 27
        *
        * 단수를 입력하세요 >>> 5
        * 5 x 1 = 5
        * 5 x 2 = 10
        * ..
        * 5 x 9 = 45
        *
        * 단수를 입력하세요 >>> 0
        * 프로그램이 종료되었습니다.
        * */
        Scanner sc = new Scanner(System.in);
        int dan = 1;
        while ( true ) {
            System.out.print("단수를 입력하세요 >>> ");
            dan = sc.nextInt();
            if ( dan==0 ) break;

            int n = 1;
            while ( n < 10 ) {
                System.out.printf("%d x %d = %d\n", dan, n, dan*n);
                n++;
            }
        }

        sc.close();
    }
}
