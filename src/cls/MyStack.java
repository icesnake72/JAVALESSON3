package cls;

import java.util.Arrays;

public class MyStack {

    private int [] arr;
    private int count;  // 배열의 길이(아이템 개수)를 저장하는 속성
    private int position;

    public MyStack() {
        arr = new int [5];
        count = 5;
        position = 0;
    }

    public MyStack(int count) {
        arr = new int [count];
        // 필드 카운트를 매개변수 카운트로 설정
        this.count = count;
        position = 0;
    }

    //
    public int getCount() {
        return count;
    }

    // add
    public void add(int value) {
        if ( position > count-1 ) {
            System.out.println("더이상 데이터를 추가할 수 없습니다.");
            return;
        }

        arr[ position++ ] = value;    // arr의 position위치에 value를 대입하고, position을 1 증가시킴
    }

    // pop
    public int pop() {
        if (position == 0) {
            System.out.println("값을 가져올 수 없습니다.");
            return 0;
        }

        return arr[--position];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public int getPosition() {
        return position;
    }
}
