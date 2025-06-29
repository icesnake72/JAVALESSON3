package interfaces;

// 메소드가 하나밖에 없는 인터페이스
@FunctionalInterface    // Annotation
public interface Creature {
    public void eat(String food);
}
