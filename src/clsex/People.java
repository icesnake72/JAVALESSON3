package clsex;

import cls.Person;

public abstract class People {
    public People() {
        System.out.println("피플 생성자가 호출되었습니다.");
    }

    // 추상 메소드( abstract method )
    public abstract void say();
//    public abstract void cry();


    public void go() {
        System.out.println("사람이 갑니다.");
    }
}
