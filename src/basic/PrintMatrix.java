package basic;

public class PrintMatrix {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            int ten = i / 10;
            int il = i % 10;
            String str = "";

            if (ten%3==0 && ten!=0)
                str = "짝";

            if (il%3==0 && il!=0)
                str += "짝";

            if (str.isEmpty())  // str이 빈 문자열이면 true를 반환한다.
                System.out.printf("%d\t", i);
            else
                System.out.printf("%s\t", str);

            if (i%10 == 0)  // 10단위 체크
                System.out.println();
        }
    }
}
