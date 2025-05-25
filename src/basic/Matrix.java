package basic;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    public static void main(String[] args) {
        int [][] arr = new int[2][3];   // 2 x 3 : 2차원 배열
        arr[0][0] = 1;  // 2차원 배열의 첫번째 행의 첫번째 열
        arr[0][1] = 2;  // 2차원 배열의 첫번째 행의 두번째 열
        arr[0][2] = 3;  // 2차원 배열의 첫번째 행의 세번째 열
        arr[1][0] = 4;  // 2차원 배열의 두번째 행의 첫번째 열
        arr[1][1] = 5;  // 2차원 배열의 두번째 행의 두번째 열
        arr[1][2] = 6;  // 2차원 배열의 두번째 행의 세번째 열
//        System.out.println( arr.length );
        for(int i=0; i<arr.length; i++) {   // arr.length : 2
            for(int j=0; j<arr[i].length; j++) {    // arr[i].length : 3
                System.out.printf("%d\t", arr[i][j]);
            }
            System.out.println();   // 줄바꿈
        }

        // 5 x 6짜리 2차원 배열을 만드세요
        int [][] lotto = new int[5][6];

        // 랜덤 객체 생성
        Random rand = new Random();

        // lotto 배열의 모든 칸에 1 ~ 45사이 랜덤값을 입력하세요
        for(int i=0; i<lotto.length; i++) {
            for(int j=0; j<lotto[i].length; j++) {
                lotto[i][j] = rand.nextInt(45) + 1;
            }

            // for문과 Arrays.toString()을 이용하여 lotto배열을 5줄로 출력하세요
            // System.out.println( Arrays.toString(lotto[i]) );
        }

//        int [] nums = new int[5];
//        for(int n : nums)

        // 각각의 행을 정렬하고 출력하세요
        for (int[] line : lotto) {
            Arrays.sort(line);
            System.out.println(Arrays.toString(line));
        }

//
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr[0]));    // [1, 2, 3]
//        System.out.println(Arrays.toString(arr[1]));    // [4, 5, 6]
//
//        int [] nums = {1,2,3};
//        nums.length
//        System.out.println( nums );
//        // Arrays.toString(nums) : nums라는 배열을 문자열 형식으로 변환
//        String strArr = Arrays.toString(nums);
//        System.out.println( strArr );


//        int [][][] arr3d = new int[2][3][2];   // 3 x 2 2차원 배열이 2개
    }
}
