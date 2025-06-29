package clsex;




public class Calculator {


    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int add(int [] arr) {
        int total = 0;
        for(int n : arr)
            total += n;

        return total;
    }

    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

}
