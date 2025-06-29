package win;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class FirstSwingApp {
    public static final int TEXT_HEIGHT = 30;
    public static int score = 0;

    public static void main(String[] args) throws IOException {

//        GameWin mainWin = new GameWin("", this);

        JFrame frame = new JFrame("자바 스윙 앱");   // 메인 윈도우
        frame.setSize(800, 600);            // 메인 윈도우의 크기
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // x버튼을 클릭했을때 액션 ===> App 종료
        frame.setLayout( null );    // 레이아웃 객체를 사용하지 않음
        frame.setResizable( false );    // 윈도우 사이징을 막음(윈도우 크기 고정시킴)
        frame.getContentPane().setBackground(new Color(25, 38, 71));
//        LayoutManager layoutManager = new FlowLayout(FlowLayout.CENTER);

        //
        WordManager wordManager = new WordManager( frame );
        wordManager.initWords("words.json");

        JTextField text = new JTextField();

        JLabel score = new JLabel();
        // score의 배경색과 폰트 지정하기
        Font font = new Font("맑은 고딕", Font.BOLD, 16);
        score.setFont(font);
        score.setBackground(new Color(34, 34, 34));
        score.setOpaque( true );    // 라벨의 배경을 불투명하게 설정하기
        score.setForeground(Color.ORANGE);

        // 메인 윈도우가 생성된 이후에 실행하도록 설정
        // 메인 윈도우가 나타나기 직전에 실행되도록 처리함
        SwingUtilities.invokeLater(text::requestFocusInWindow); // text 에 포커싱을 해라

        // frame(메인 윈도우)의 이벤트 리스너를 설정
        frame.addComponentListener(new ComponentListener() {
            // 윈도우의 사이즈가 변경되면 실행(이벤트가 발생) <--
            @Override
            public void componentResized(ComponentEvent e) {
                // text 위젯을 메인 윈도우 하단에 고정시키기
                int y = frame.getContentPane().getHeight() - TEXT_HEIGHT;
                text.setBounds(0, y, frame.getWidth(), TEXT_HEIGHT);
                score.setBounds(0, 0, frame.getWidth(), TEXT_HEIGHT);
                // score.setEnabled( false );  // 편집을 막음
            }

            @Override
            public void componentMoved(ComponentEvent e) {} // 메인윈도우가 이동되었을때 실행
            @Override
            public void componentShown(ComponentEvent e) {} // 메인윈도우가 보여졌을때 실행
            @Override
            public void componentHidden(ComponentEvent e) {} // 메인윈도우가 감춰졌을때 실행
        });

        text.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                // text 에서 엔터키가 눌렸으면
                if ( e.getKeyCode() == KeyEvent.VK_ENTER ) {
                    // 입력된 글자와 같은 라벨을 찾아서 지움
                    //
                    String inputText = text.getText();
                    System.out.println( inputText );
                    if ( wordManager.remove( inputText ) ) {
                        // score의 텍스트를 10점씩 증가시키기
                        FirstSwingApp.score += 10;
                        // 점수 : 100 점
                        score.setText( String.format("점수 : %d 점", FirstSwingApp.score) );
                        System.out.println( FirstSwingApp.score );
                    }

                    text.setText("");   // text clear
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {}
        });


        frame.add(text);    // 텍스트 입력창을 메인윈도우에 추가 시킴
        frame.add(score);

        // Timer Thread를 생성한다.
        Timer timer = new Timer(1000, (event)->{
            // Timer Thread에서 하는일 정의
            wordManager.add();  // FallingLabel 인스턴스를 한개씩 추가시킴
        });

        // Timer Thread 시작시키기
        timer.start();

        // 윈도우를 보이게 함
        frame.setVisible(true);
    }
}
