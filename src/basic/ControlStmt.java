package basic;

import java.util.Scanner;

public class ControlStmt {
    public static void main(String[] args) {
        // if 문
        /*
        * 1 형식)
        * if (조건식 또는 논리식) {
        *   조건식 또는 논리식이 참인경우 실행되는 명령문들...
        * }
        *
        * 2 형식)
        * if ( 조건식 또는 논리식) {
        *   조건식 또는 논리식이 참인경우 실행되는 명령문들...
        * } else {
        *   조건식 또는 논리식이 거짓인경우 실행되는 명령문들...
        * }
        *
        * 3 형식)
        * if ( 조건식 또는 논리식 1 ) {
        *   위 조건식이 참인 경우 실행되는 명령문들...
        * } else if ( 조건식 또는 논리식 2 ) {
        *
        * } else if ( 조건식 또는 논리식 3 ) {
        *
        * } ...
        * */
        Scanner sc = new Scanner(System.in);

        int age = 0;
        System.out.print("나이를 입력하세요 >>> ");
        age = sc.nextInt();

//        if ( age > 18 ) {
//            System.out.println("당신은 성인입니다");
//        }

        if ( age > 18 ) {
            System.out.println("당신은 성인입니다");
        } else {
            System.out.println("당신은 성인이 아닙니다");
        }

        sc.close();
    }
}
