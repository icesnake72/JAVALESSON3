package basic;

import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
        int []nums = {10, 20, 30};
        for(int i=0; i<3; i++) {
            System.out.println(nums[i]);
        }

        System.out.print("배열의 개수를 입력하세요 >>> ");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        // 데이터타입 [] 배열명 = new 데이터타입[아이템개수];
        int [] arr = new int[count];
        for(int i=0; i<arr.length; i++) {   // 배열의 길이 : 배열명.length
            arr[i] = (i+1)*10;
            System.out.printf("%d\t", arr[i]);
        }

        sc.close();

        System.out.println();

        // arr 10칸짜리 배열을 만들고, 각 아이템에 2부터 짝수가 입력되도록 코드를 작성.
        for(int i=0; i<arr.length; i++) {
            arr[i] = (i+1)*2;
            System.out.printf("%d\t", arr[i]);
        }

        System.out.println();

        // arr배열에서 0번째 인덱스의 아이템부터 짝수 인덱스에 해당하는 값만 가져오기
        for(int i=0; i<arr.length; i+=2) {
            System.out.printf("%d\t", arr[i]);
        }

        System.out.println();

        // 값을 조회하는 경우에만 사용한다.
        for(int n : arr) {
            System.out.printf("%d\t", n);
        }
    }
}
