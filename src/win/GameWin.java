package win;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {
    private FirstSwingApp app;
    public GameWin(String title, FirstSwingApp app) {
        super( title );

        //
        this.app = app;
        setSize(800, 600);            // 메인 윈도우의 크기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // x버튼을 클릭했을때 액션 ===> App 종료
        setLayout( null );    // 레이아웃 객체를 사용하지 않음
        setResizable( false );    // 윈도우 사이징을 막음(윈도우 크기 고정시킴)
        getContentPane().setBackground(new Color(25, 38, 71));
    }
}
