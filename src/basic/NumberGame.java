package basic;


import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;   // 1 ~ 10
        System.out.println(n);

        Scanner sc = new Scanner(System.in);

        int num = -1;
        while ( num != n ) {
            System.out.print("숫자를 입력하세요 >>> ");
            num = sc.nextInt();
//            if ( num == n ) break;

            if ( num > n )
                System.out.println("UP");
            else
                System.out.println("DOWN");
        }
        System.out.println("정답입니다.");

        sc.close();
    }
}
