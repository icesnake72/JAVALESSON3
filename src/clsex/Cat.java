package clsex;

public class Cat extends Animal {

    public Cat(String name) {
        super( name );
    }

    @Override
    public void cry() {
        System.out.println("야옹");
    }


}
