package generic;

// LIFO(Last In First Out)
public class MyStack<T> {
    private T [] arr;
    private int pos;    // indexing

    public MyStack(int cap) {
        arr = (T[]) new Object[cap];
        pos = 0;
    }

    public void add(T n) {
        if ( pos < arr.length ) {
            arr[pos++] = n;
        } else {
            throw new ArrayIndexOutOfBoundsException("용량 초과");
        }
    }

    public int getPos() {
        return pos;
    }

    public T pop() {
        if ( pos > 0 ) {
            return arr[--pos];
        } else {
            throw new ArrayIndexOutOfBoundsException("잘 못된 인덱싱");
        }
    }
}
