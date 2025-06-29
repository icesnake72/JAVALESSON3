package clsex;

public class Pig extends Animal {

    public Pig(String name) {
        super(name);    // Animal(name)
    }

    @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}
