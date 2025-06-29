package interfaces;

public class Tiger implements Animal, Creature{
    // Animal
    @Override
    public void cry() {
        System.out.println("어흥");
    }

    // Animal
    @Override
    public void go() {
    }

    // from Creature
    @Override
    public void eat(String food) {
    }
}
