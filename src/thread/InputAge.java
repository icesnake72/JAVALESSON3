package thread;

import java.util.Scanner;

public class InputAge {

    public static int input() throws AgeException, NumberFormatException
    {
        Scanner sc = new Scanner(System.in);

        String age = sc.nextLine();

        int ret = 0;
        ret = Integer.parseInt(age);
        if ( ret < 0 )
            throw new AgeException("나이는 0보다 작을 수 없습니다");

        sc.close();

        return ret;
    }
}
