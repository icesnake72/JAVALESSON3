package basic;

import java.util.Random;
import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {
        Random rand = new Random(42);   // 난수값을 생성하는 클래스
        int num = rand.nextInt(10);

        // 인스턴스를 생성하는 방법
        // 클래스명 객체명 = new 생성자();
        // Scanner sc = new Scanner(System.in);

//        if ( num == 1) {
//
//        } else if ( num == 2) {
//
//        } else if ( num == 3) {
//
//        }

        switch ( num )
        {
            case 1:
                System.out.println("생성된 값은 1입니다.");
                break;

            case 2:
                System.out.println("생성된 값은 2입니다.");
                break;

            case 3:
                System.out.println("생성된 값은 3입니다.");
                break;  // 현재 블록을 탈출시킴

            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("생성된 값은 3보다 큽니다.");
                break;

            default:
                System.out.println("num에 해당하는 값이 없습니다.");
        }   // switch

    }
}
