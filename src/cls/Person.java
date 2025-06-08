package cls;

// 클래스는 로보트의 설계도와 같다
// 클래스의 구성 : 데이터 요소 + 행위(기능) 요소 ===> 멤버
// 멤버 변수 : 필드, Attribute(속성)
// 멤버 함수 : method(메소드)

// 예를들어...
// 로봇 청소기 : 움직이기, 바퀴, 흡입기, 걸레, 물통, 흡입, 닦기

// 접근 제한자 : 멤버를 선언할때 반드시 제일 앞에 붙여주어야 한다!
// public : 완전 공개, 어디에서도 이 요소에 접근할 수 있다.
// private : 완전 비공개, 해당 클래스 내부 요소에서만 접근할 수 있다.
// protected : 원칙은 비공개, 상속받은 자식 클래스와 같은 패키지의 다른 클래스에서 접근할 수 있다.
// default : 원칙은 비공개, 패키지의 다른 클래스에서 접근할 수 있다.

public class Person {

    // 생성자(Constructor)
    // 모든 클래스는 하나 이상의 생성자를 갖는다.
    // 생성자는 클래스 이름과 동일하게 만들어야 한다.

    // 기본 생성자의 모양
    public Person() {
        name = "이름없음";
        age = 1;
        gender = "모름";
    }

    public Person(String name, int age) {
        this.name = name;
        gender = "모름";

        if ( age > 0 )
            this.age = age;
    }

    // 접근제한자 데이터타입 변수명;
    private String  name;
    private int     age;
    private String  gender;

    // Person class의 기능 요소
    // 반환형중에 void는 반환값이 없음을 의미한다.
    public void introduce() {
        System.out.printf("안녕하세요, 저는 %s이고, 나이는 %d살이고 %s입니다.\n", name, age, gender);
    }

    // 메소드 : 클래스의 기능을 정의
    // 접근제한자 반환형 메소드_이름([매개변수들...]) { 실행할 명령문들... }
    // 반환형이 void가 아닌 메소드에서는 반드시 return 이라는 키워드를 이용하여 호출한쪽에 결과를 반환해주어야 한다!
    // 반드시 메소드의 반환형과 return 되는 자료형이 일치해야 한다!
    public int getAge() {
        return age;
    }

    public void increaseAge() {
        ++age;
    }

    // decreaseAge
    public void decreaseAge() {
        --age;
    }

    // 성별 설정 : 성별은 문자열 "남자" 또는 "여자"로만 입력할 수 있다는 규칙을 정함
    public void setGender(String g) {
        String str = "abc";
        if (g.equals("남자") || g.equals("여자"))
            gender = g;
        else
            System.out.println("성별은 남자 또는 여자 로만 입력할 수 있습니다.");
    }

    public String getGender() {
        return gender;
    }

    // name 필드의 setter와 getter를 만드세요
    // setName : 이름을 설정하는 메소드를 만드세요
    // getName : 이름을 외부에 반환하는 메소드를 만드세요
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
//        String str = String.format("이름 : %s, 나이 %d, 성별: %s", name, age, gender);
        return String.format("이름 : %s, 나이 %d, 성별: %s", name, age, gender);
    }
}


