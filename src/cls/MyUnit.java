package cls;

// Marine : steampack
// Tank : 공격력 + 20, 체력 + 100


// 필드(Field) : 멤버 변수, 데이터 요소, 정수형으로 hp, power
// 메소드(method) : 멤버 함수
// 매개변수(Parameter, Argument, 인수, 인자) : 메소드에서 외부로부터 주어지는 입력값으로 초기화되는 변수
// 매개변수가 정의되는 곳은 메소드명([매개변수들...])
public class MyUnit {
    private int hp;
    private int power;
    private String name;

    // hp는 100, power는 100으로 설정하는 기본 생성자를 만드세요
    public MyUnit() {
        hp = 100;
        power = 100;
    }

    // 외부로부터 hp와 power를 입력받아서 멤버 hp와 power를 설정하는 생성자
    public MyUnit(String name, int hp, int power) {
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    // 외부에서 호출가능하도록
    // 반환값이 없는 메소드 damage를 만드세요
    // 매개변수로 power(정수형)가 주어지고,
    // 멤버 변수 hp를 매개변수 power만큼 차감합니다
    // hp에서 power를 차감한 값이 음수이면 hp는 0으로 설정합니다.
    public void damage(int power) {
        hp -= power;
        if ( hp < 0 )
            hp = 0;
    }

    public void attack(MyUnit target) {
        target.damage(power);
    }

    // 외부에서 호출가능하도록
    // hp와 power를 출력하는 메소드 info 를 만드세요
    public void info() {
        System.out.printf("[%s] hp : %d, power : %d\n", name, hp, power);
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("[%s] hp:%d, power:%d", name, hp, power);
    }
}

