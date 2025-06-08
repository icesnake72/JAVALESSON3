package cls;

public class MyInt {
    private int n;

    public MyInt() {
        n = 0;
    }

    public MyInt(int n) {
        this.n = n;
    }

    // 필드 n을 외부로부터 입력받아서 설정하는 setter 메소드를 정의하세요
    public void setN(int n) {
        this.n = n;
    }

    // 필드 n을 외부로 제공하는 getter 메소드를 정의하세요
    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return String.format("%d", n);
    }

    @Override
    public boolean equals(Object obj) {
        // 우선 주체와 비교대상(obj)의 클래스가 동일한지 검사한다.
        if (!(obj instanceof MyInt))
            return false;

        MyInt target = (MyInt) obj;

        // 주체의 필드 n과 비교대상(obj)의 필드 n이 서로 동일한지 검사하고, 같으면 true, 다르면 false를 반환하도록 한다.
        return n == target.n;
    }
}


// 사용자 아이디(문자열)와 비밀번호(문자열)를 필드로 갖는 class MyAccount 클래스를 정의하고
// 기본 생성자에서는 아이디 = "", 비밀번호 = ""로 정의하고,
// 추가 생성자에서는 아이디와 비밀번호를 매개변수로 입력받아 필드에 대입하도록 정의하세요