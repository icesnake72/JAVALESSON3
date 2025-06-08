package cls;

public class Student extends Person {
    private String school;
    private int grade;

    // 생성자 : 이름, 나이, 성별, 학교
    // grade는 무조건 1로 설정
    public Student(String name, int age, String gender, String school) {
        super(name, age);   // Person의 생성자를 이용
        setGender(gender);  // Person에 구현해놓은 setGender 메소드를 이용하여 설정

        this.school = school;
        grade = 1;
    }


    @Override   // 해당 메소드를 재정의, 메소드 오버라이드
    public void introduce() {
        super.introduce();  // 부모 클래스(Person)에서 정의된 introduce()메소드를 호출
        System.out.printf("학교는 %s에 다니고 있습니다.\n", school);
    }


    // Object class의 equals method를 재정의함
    @Override
    public boolean equals(Object obj) {

        // 매개변수 obj가 Student 클래스로부터 생성된 인스턴스인지 먼저 검사
        if ( !(obj instanceof Student) )
            return false;

        Student target = (Student) obj; // 형변환 Object -> Student

        return getName().equals(target.getName()) &&
                getAge() == target.getAge() &&
                getGender().equals(target.getGender()) &&
                school.equals(target.school) &&
                grade == target.grade;
    }
}

// MyInt 라는 이름의 클래스를 만들고
// 속성(필드)로 int n 을 완전 비공개 멤버로 정의하세요
// 기본 생성자를 만들고 데이터 n을 0으로 초기화하세요
// 추가 생성자를 만들고 매개변수 n을 받아서 속성 n을 매개변수 n으로 초기화하세요





