package thread;

public class InputAgeTest {
    public static void main(String[] args) {
        System.out.println("나이를 입력하세요");

        try {
            int ret = InputAge.input();
            System.out.printf("입력된 나이는 %d살 입니다", ret);
        } catch (NumberFormatException e) {
            System.out.println( e.getMessage() );
        } catch (AgeException e) {
            System.out.println( e );
        }
    }
}
