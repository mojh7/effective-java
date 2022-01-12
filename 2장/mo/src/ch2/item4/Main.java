package ch2.item4;

public class Main {
    public static void main(String[] args) {
        // error : UtilityClass()' has private access in 'ch2.item4.UtilityClass'
        // UtilityClass utilityClass = new UtilityClass();

        UtilityClass.printHelloWorld(); // output : hello world
    }
}

class UtilityClass {
    private UtilityClass() {
        throw new AssertionError();
    }

    static void printHelloWorld() {
        System.out.println("hello world");
    }
}
