package generic;

import cls.Person;

public class ArrayTest {
    public static void main(String[] args) {

        // primitive type : byte, char, short, int, long, float, double, boolean
        // referenced type : Object, String...
        MyStack<Integer> stack = new MyStack<>(5);

        try {
            stack.add(1);
            stack.add(2);
            stack.add(3);
            stack.add(4);
            stack.add(5);
//            stack.add(6);
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( e.getMessage() );
        }

//        System.out.println( stack.getPos() );

        try {
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );

        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( e.getMessage() );
        }


        MyStack<String> strStack = new MyStack<>(10);
        strStack.add("String1");
        strStack.add("String2");
        strStack.add("String3");

        int count = strStack.getPos();
        for(int i=0; i<count; i++) {
            System.out.println( strStack.pop() );
        }

        Person p1 = new Person("홍길동", 10);
        Person p2 = new Person("이순신", 20);
        Person p3 = new Person("강감찬", 30);
        MyStack<Person> people = new MyStack<>(3);
        people.add( p1 );
        people.add( p2 );
        people.add( p3 );

    }
}
