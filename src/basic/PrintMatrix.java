package basic;

public class PrintMatrix {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            int ten = i / 10;
            int il = i % 10;

            if (i%3==0)
                System.out.print("짝\t");
            else
                System.out.printf("%d\t", i);

            if (i%10 == 0)  // 10단위 체크
                System.out.println();
        }
    }
}
