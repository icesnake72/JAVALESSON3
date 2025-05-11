package basic;

public class Operators {
    public static void main(String[] args) {
        // 연산자
        // 산술연산자
        // 대입연산자
        // 조건(비교)연산자
        // 논리연산자
        // 비트연산자
        // 기타연산자

        // 산술연산자 : +, -, *, /, %
        // 정수와 정수의 산술 연산의 결과는 정수이다.
        int num1 = 10;
        int num2 = 3;
        int num3 = 0;
        float r1 = 3.0F;
        float r2 = 0.F;
        num3 = num1 + num2;

        num3 = num1 / num2;     // 정수의 나누기 결과는 정수!!!
        System.out.printf("%d / %d = %d\n", num1, num2, num3);

        num3 = num1 % num2;
        System.out.printf("%d %% %d = %d\n", num1, num2, num3);

        num3 = (int)(num1 / r1);     // 실수를 정수(int)형으로 형변환(type cast)한다.
        System.out.printf("%f\n", num1 / r1);
        System.out.printf("%d / %d = %d\n", num1, num2, num3);

        r2 = num1 / r1;
        System.out.printf("%d / %f = %f\n", num1, r1, r2);

        // 대입 연산자 : 대입연산자를 기준으로 오른쪽의 내용을 왼쪽에 대입한다.
        // L.Value = R.Value : L.Value는 무조건 변수만 올 수 있고, R.Value는 변수, 값, 수식, 함수등이 올 수 있다.
        num1 = 2;
        num3 = 0;
        num3 = num3 + num1; // 0 + 2 ==> num3
        num3 += num1;   // num3 = num3 + num1;

        // 비교 연산자 : >, >=, <, <=, ==, !=
        num1 = 10;
        num2 = 5;
        boolean check;
        check = num1 > num2;
        System.out.println(check);  // true

        check = num1 == num2;       // false
        System.out.println(check);

        check = num1 != num2;       // true
        System.out.println(check);

        // 논리 연산자 : &&(AND), ||(OR), !(NOT)
        check = num1 > num2;    // true
        boolean check2 = num1 == num2;  // false
        System.out.print(check);
        System.out.print(check2);
        /*
        * A     B       A && B      A || B      !A
        * T     T       T           T           F
        * T     F       F           T           F
        * F     T       F           T           T
        * F     F       F           F           T
        * */

        // 증감 연산자
        num1 = 0;
        num1++;     // num1 = num1 + 1;
        num1--;     // num1 = num1 - 1;
        System.out.printf("num1 = %d\n", num1++);
        System.out.printf("num1 = %d\n", ++num1);

        // 삼항 연산자 : 변수 = 조건식 ? 조건식이 참일때 값 : 조건식이 거짓일때 값;
        int age = 18;
        String str = age > 18 ? "성인" : "청소년";
    }
}
