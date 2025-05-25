package basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class ArrayExt {
    public static void main(String[] args) {
        // primitive type : byte, char, short, int, long, float, double, boolean
        // referenced type : String, class
        // Wrapper Class
        // Byte, Character, Short, Integer, Long, Float, Double, Boolean

        Integer [] arr = new Integer[10];

        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(45)+1;
        }

//        for(int n : arr) {
//            System.out.printf("%d\t", n);
//        }
        // Arrays.toString(arr) : arr배열을 문자열로 변환
        System.out.println( Arrays.toString(arr) ); // 디버깅 용도

//        Arrays.sort( arr ); // 오름차순
//        System.out.println( Arrays.toString(arr) ); // 디버깅 용도
//
//        Arrays.sort(arr, Comparator.reverseOrder());    // 내림차순
//        System.out.println( Arrays.toString(arr) ); // 디버깅 용도


        // val을 arr에서 찾아보고 몇번째 인덱스에 있는지 배열과 해당 인덱스값을 출력하는 코드를 작성하세요
        // 찾았을때)
        // [ 배열 .... ]
        // val : xx는 index : yy에 있습니다.

        // 못 찾았을때)
        // [ 배열 .... ]
        // val : xx는 배열에 존재하지 않습니다.

        // 배열 전체를 출력 : 검색 결과 유무에 상관없이 출력
        System.out.println( Arrays.toString(arr) );

        int val = rand.nextInt(45) + 1;

        boolean find = false;   // 검색 성공여부 체크하는 플래그
        for(int i=0; i<arr.length; i++) {
            if ( val == arr[i] ) {
                System.out.printf("val : %d는 인덱스 %d에 있습니다\n", val, i);
                find = true;
                break;
            }
        }

        if (!find) {
            System.out.printf("val : %d는 배열에 존재하지 않습니다.\n", val);
        }

        // 순차 정렬
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if ( arr[i] > arr[j] ) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println( Arrays.toString(arr) ); // 디버깅 용도
    }
}
