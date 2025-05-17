package basic;

import java.util.Scanner;

public class WhileStmt {

    public static void main(String[] args) {
        // 반복문
        // while, do ~ while, for ===> enhanced for, map, ...

        // while ( 조건식 ) {
        //     조건식이 참인동안 반복 실행될 명령문들...
        // }
        int n = 0;
        while ( n < 10 ) {
            System.out.println(n++);
        }

        n = 0;
        while( true ) {
            System.out.println(n++);
            if ( n > 10 ) break;    // break문을 이용하여 현재 반복문을 탈출할 수 있다.
        }

        // Scanner 를 이용하여 정수를 입력받고
        // 해당 정수까지 반복수행하면서 현재 값을 출력하는 반복문을 구현하세요
//        Scanner sc = new Scanner(System.in);
//        System.out.print("정수를 입력하세요 >>> ");
//        int until = sc.nextInt();
//        n = 0;
//        while ( n < until) {
//            System.out.println(n++);
//        }
//        sc.close();

        // 1부터 10까지의 합을 구하는 코드를 작성하세요
        // 출력형식)
        // 1부터 10까지의 합 : 55
        // 1 + 2 + 3 + 4 .. + 9 + 10 > 55
        int total = 0;  // 누적변수 클리어
        n = 1;
        while ( n <= 10 ) {
            total = total + n;
            n++;
        }
        System.out.printf("1부터 10까지의 합 : %d\n", total);

        // 사용자가 0을 입력할때까지 숫자를 입력받고, 해당 숫자를 출력하기
        // 출력형식)
        // 숫자를 입력하세요 >>> 1
        // 1
        // 숫자를 입력하세요 >>> 2
        // 2
        // 숫자를 입력하세요 >>> 0
        // while문이 종료됨
        Scanner sc2 = new Scanner(System.in);
        while( true ) {
            System.out.print("숫자를 입력하세요 >>> ");
            n = sc2.nextInt();
            if (n == 0) break;  // 사용자가 0을 입력했다면 while문 즉시 탈출
            System.out.println(n);
        }
        sc2.close();

        // 구구단 3단을 출력하는 코드를 작성하세요
        // 3 x 1 = 3
        // 3 x 2 = 6
        // 3 x 3 = 9
        // ...
        // 3 x 9 = 27
        n = 1;
        while(n < 10) {
            System.out.printf("3 x %d = %d\n", n, 3*n);
            n++;
        }
        System.out.println("while문이 종료됨");
    }
}
