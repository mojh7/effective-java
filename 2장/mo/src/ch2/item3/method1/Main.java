package ch2.item3.method1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE);
        System.out.println(Singleton.INSTANCE);
        System.out.println(Singleton.INSTANCE);
        /* 출력
         private constructor
         ch2.item3.method1.Singleton@75b84c92
         ch2.item3.method1.Singleton@75b84c92
         ch2.item3.method1.Singleton@75b84c92
         */
    }
}

// public static final 필드 방식
class Singleton {
    public static final Singleton INSTANCE = new Singleton();
    private Singleton() {
        System.out.println("private constructor");
    }
}