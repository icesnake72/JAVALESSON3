package cls;

public class StackTester {
    public static void main(String[] args) {
        MyStackEx st1 = new MyStackEx();
        for(int i=0; i<10; i++) {
            if (!st1.isAddPossible())
                break;

            st1.add(i + 1);
        }

        System.out.println( st1 );
    }
}
