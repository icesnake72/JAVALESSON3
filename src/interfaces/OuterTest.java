package interfaces;

public class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println( outer.name );

        Tiger tiger = new Tiger();
        outer.animalCry( tiger );

        // outer.animalCry( /* Animal interface를 구현한 클래스로 생성된 인스턴스 */ );
        // 익명 클래스 : 이름없는 클래스 ==> 즉석
        outer.animalCry(new Animal() {
            @Override
            public void cry() {
                System.out.println("야옹야옹");
            }

            @Override
            public void go() {}
        });

//        outer.animalGo(new Creature() {
//            @Override
//            public void eat(String food) {
//                System.out.println("냠냠");
//            }
//        });

        // 함수형 프로그래밍
        // Lambda Expression : 람다 표현식
        outer.animalGo( (food)->{
            System.out.println("냠냠 " + food);
            // ...
        } );




        // class name inst.name = inst.new 내부클래스 생성자();
        Outer.Inner inner = outer.new Inner();
        System.out.println( inner.name );


    }
}
