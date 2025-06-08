package cls;

public class MyIntTester {
    public static void main(String[] args) {
        // 정수 데이터 10을 갖는 MyInt형 인스턴스 1개와,
        // 정수 데이터 20을 갖는 MyInt형 인스턴스 1개를 생성하세요
        // 클래스명 인스턴스명 = new 생성자;
        MyInt n1 = new MyInt(10);
        MyInt n2 = new MyInt();
        n2.setN(10);

        System.out.println( n1 );
        System.out.println( n2 );

        String str = "10";

        if (n1.equals(str))
            System.out.println("n1은 n2와 같습니다");
        else
            System.out.println("n1은 n2와 다릅니다");

    }
}
