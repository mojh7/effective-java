package ch2.item3.method2;

import java.io.Serializable;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        /* 출력
        private constructor2
        ch2.item3.method2.Singleton@75b84c92
        ch2.item3.method2.Singleton@75b84c92
        ch2.item3.method2.Singleton@75b84c92
         */
    }
}

// 정적 팩터리 방식
class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {
        System.out.println("private constructor2");
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}