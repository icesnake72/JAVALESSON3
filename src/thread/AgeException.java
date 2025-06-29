package thread;

// class 앞에 final이 있으면 해당 클래스는 더이상 파생시킬 수 없는 최종 자식 클래스이다.
public final class AgeException extends Exception {

    private final String message;

    public AgeException(String msg) {
        message = msg;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
