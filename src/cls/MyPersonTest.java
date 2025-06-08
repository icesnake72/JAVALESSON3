package cls;

import java.util.Random;    // Random이라는 클래스를 사용하기 위해 이 파일에 import시킴

public class MyPersonTest {
    public static void main(String[] args) {

        // primitive type : byte, char, short, int, long, float, double, boolean
        // referenced type : String, ...

        // Person : class
        // k1 : Object(객체, 인스턴스, instance)
        // 클래스명 객체명 = new 생성자;


        Person k1 = new Person();   // Person 클래스로부터 k1 인스턴스가 생성되며, 생성자가 자동으로 호출된다.

        k1.increaseAge();
        k1.setGender("남성");
        k1.setGender("남자");
        k1.introduce();
        int k1_age = k1.getAge();
        System.out.println(k1_age);
//        k1.gender = "남성";


        Student k2 = new Student("홍길동", 18, "남자", "하바드");
        k2.introduce();

        // String str = "대한민국";
        String str1 = new String("대한민국");
        String str2 = new String("대한민국");
        System.out.println( str1 );
        // if (str1 == str2)
        if ( str1.equals(str2) )
            System.out.println("str1은 str2와 같다");
        else
            System.out.println("str1은 str2와 다르다");

        System.out.println( k1 );   // Person.toString()메소드를 재정의하여 인스턴스를 문자열로 반환한다.
        System.out.println( k2 );

        Student k3 = new Student("홍길동", 18, "남자", "하바드");
        if ( k2.equals(k3) )
            System.out.println("k2와 k3는 동일 인물입니다.");
        else
            System.out.println("k2와 k3는 다른 인물입니다.");
    }
}
