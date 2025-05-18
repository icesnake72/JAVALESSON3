package basic;

import java.util.Scanner;

public class DoWhileStmt {
    public static void main(String[] args) {
        // do ~ while
//        do {
//              반복 실행될 명령문들...
//        } while( 조건식 );

//        int n = 10;

//        do {
//            while ( n < 10 ) {
//                System.out.println("while 반복문안의 명령이 실행됨!");
//            }
//            System.out.println("반복문안의 명령이 실행됨!");
//        } while( n < 10 );

        Scanner sc = new Scanner(System.in);
        int dan = 1;
        do{
            System.out.print("단수를 입력하세요 >>> ");
            dan = sc.nextInt();
            if ( dan==0 ) break;

            int n = 1;
            while ( n < 10 ) {
                System.out.printf("%d x %d = %d\n", dan, n, dan*n);
                n++;
            }
        } while ( true );
        sc.close();

        System.out.println("반복문이 종료됨");
    }
}
