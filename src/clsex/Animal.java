package clsex;

// 추상 클래스(abstract class)
public abstract class Animal {
    private String name;

    // 생성자(Constructor)
    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    // 추상메소드
    public abstract void cry();
}

// Animal 클래스를 상속하는 Pig, Dog, Cat 클래스를 만들고 cry()를 각각 구현하세요
// cry() 메소드에서...
// Pig는 꿀꿀을 출력
// Dog는 멍멍을 출력
// Cat은 야옹을 출력




