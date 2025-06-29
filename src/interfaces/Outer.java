package interfaces;

public class Outer {
    public String name;
    public Outer() {
        name = "외부 클래스";
    }

    public void animalCry(Animal ani) {
        ani.cry();
    }

    public void animalGo(Creature ani) {
        ani.eat("고기");
    }


    public class Inner {
        public String name;
        public Inner() {
            name = "내부 클래스";
        }
    }
}
