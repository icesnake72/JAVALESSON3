package clsex;

public class Dog extends Animal{

    private int birth;

    public Dog(String name) {
        super(name);    // 부모 클래스의 생성자를 호출 ---> 부모 클래스에서 보유하는 속성들을 초기화
        birth = 0;
    }

    @Override
    public void cry() {
        System.out.println("멍멍");
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }
}
