package basic;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Random rand = new Random();
        for(int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }

        // 정렬
        Arrays.sort( arr );

        // 버블 정렬 알고리즘을 이용하여 배열을 정렬하세요
        for(int i=arr.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 배열 출력
        System.out.println( Arrays.toString(arr) );

        // 찾을값을 랜덤하게 설정
        int val = rand.nextInt(1000);

        // 이진 탐색(Binary Search)
        int start = 0;  // 배열의 시작 인덱스
        int end = arr.length - 1;   // 배열의 마지막 인덱스

        int count = 0;
        boolean flag = false;
        while(start <= end) {
            count++;
            int mid = (end - start) / 2 + start;    // 현재 배열의 가운데 인덱스
            System.out.printf("mid : %d\n", mid);
            if ( arr[mid] == val ) {
                // val을 배열에서 찾은경우
                System.out.printf("%d는 배열의 %d 인덱스에 있습니다.\n", val, mid);
                System.out.printf("%d번째만에 값을 찾았습니다.\n", count);
                flag = true;
                break;
            }

            if ( arr[mid] > val )
                end = mid - 1;
            else
                start = mid + 1;
        }

        if (!flag) {
            System.out.printf("%d번 반복 수행함\n", count);
            System.out.printf("%d를 배열에서 찾지 못 했습니다.\n", val);
        }
    }
}
