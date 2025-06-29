package clsex;

public class PeopleTester {
    public static String codeName = "피플테스트";

    public void test() {
        // PeopleTester.changePigName();
    }

    public static void changePigName(Pig pig, String name) { // Pig pig = p1;

        pig.setName(name);
    }



    public static void main(String[] args) {

        // Animal ani = new Animal();   // 추상 클래스를 이용하여 인스턴스를 직접 생성할 수 없다.

//        People p1 = new People();

        Cat c1 = new Cat("뚱뚱이");
//        Cat c2 = new Cat(c1.getName()); // 깊은 복사(Deep Copy)

        c1.setName("검둥이");  // c1 인스턴스의 이름을 변경해도 c2의 이름이 변경되지 않는다.
//        Cat c3 = c1;    // 얕은 복사
//        c3.setName("흰둥이");

        Dog d1 = new Dog("뿡뿡이");
        Pig p1 = new Pig("홀쭉이");

        changePigName(p1, "얼룩이");
        System.out.println( p1 );

        changePigName(new Pig("말랑이"), "점백이");
//        System.out.println( p11 );

//        // Animal class를 상속받는 모든 클래스에서 공통적으로 아래의 기능을 지원
//        System.out.println( c1 );   // 뚱뚱이
//        System.out.println( c2 );   // 뚱뚱이
//        System.out.println( d1 );   // 뿡뿡이
//        System.out.println( p1 );   // 홀쭉이
//

//        Object [] arrObj = { c1, d1, p1 };
        Animal [] arrAni = { c1, d1, p1 };  // Pig, Cat, Dog, Animal, Object

        for(Animal obj : arrAni) {
            obj.cry();
        }

        Animal c2 = new Cat("호랑이");
        Animal p2 = new Pig("날씬이");
        Animal d2 = new Dog("발발이");
        Dog d3 = (Dog)d2;   // 다형성을 이용한 형변환 허용
        d3.setBirth(10);
        ((Dog)d2).setBirth(20); // 다형성을 이용한 형변환 허용

        // 주의 : 코드상에서는 컴파일 에러가 발생하지 않지만.
        // 반드시 런타임 에러(Exception)를 발생시킨다.
        d3 = (Dog)p2;
        d3.setBirth(10);


        People [] myArr = new People[3];
//        myArr[0] = new American();
//        myArr[1] = new Korean();
//        myArr[2] = new Japanese();
//        for(Object obj : myArr) {
//            People p = (People) obj;
//            p.say();
//        }

//        American p1 = new American();
//        Korean p2 = new Korean();
//        Japanese p3 = new Japanese();

//        p1.say();
//        p2.say();
//        p3.say();


        System.out.println();

//        Calculator calc = new Calculator();
        Calculator.add(10, 20);



    }
}
