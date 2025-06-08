package cls;

// 상속되어진 클래스 ===> 자식 클래스, 파생 클래스
// 여기에서 MyUnit 클래스는 Marine의 부모 클래스, 수퍼 클래스
public class Marine extends MyUnit {

    public Marine(String name, int hp, int power) {
        super(name, hp, power); // 부모 클래스의 생성자를 호출
    }

    public void steampack() {
        setPower( getPower()+10 );
    }
}
