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


// 클래스
// 제목(문자열), 날짜(문자열), 내용(문자열)

// 클래스
// 직업(문자열), 스킬(문자열), HP(int), MP(int)

// 직원(Employee) 클래스를 만드세요
// Person 클래스로부터 상속받아서 만듭니다.
// 회사명(문자열), 직급(문자열), 부서(문자열)를 추가 필드로 정의하세요
// 각각의 필드에 대해서 setter와 getter를 정의하세요
// introduce 메소드를 재정의(Override)하여 이름, 회사, 부서, 직급 순으로 출력되도록 정의하세요
