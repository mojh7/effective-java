package ch2.item1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {

        int num = 12321;
        float f = 123.2123f;
        String str = String.valueOf(num);
        String str2 = String.valueOf(f);
        String str3 = String.valueOf(true);
        System.out.println(str); // 12321
        System.out.println(str2); // 123.2123
        System.out.println(str3); // true


        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2022, 1, 1, 22, 30));
        System.out.println(Boolean.TRUE);

        //LocalDateTime
        //Collections
        //EnumSet

        // jdbc example

        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/example";
        String user = "root";
        String pw = "1234";

        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(url, user, pw);

            System.out.println(connection.getClientInfo());
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    int fun1() {
        return 1;
    }

    int fun1(int a) {
        return a;
    }
}

class Car {
    public Car() {

    }
}

class Chocolate {
}

class Vanilla {
}

class StrawBerry {
}

class IceCream {
    Chocolate chocolate;
    Vanilla vanilla;
    StrawBerry strawBerry;

    private IceCream(Chocolate chocolate, Vanilla vanilla, StrawBerry strawBerry) {
        this.chocolate = chocolate;
        this.vanilla = vanilla;
        this.strawBerry = strawBerry;
    }

    static IceCream createWith(Chocolate chocolate) {
        return new IceCream(chocolate, null, null);
    }

    static IceCream createWith(Vanilla vanilla) {
        return new IceCream(null, vanilla, null);
    }

    static IceCream createWith(StrawBerry strawBerry) {
        return new IceCream(null, null, strawBerry);
    }
}

class Animal {
    String name;

    // error
    /*private Animal(String name) {
        this.name = name;
    }*/

    /*private Animal() {
    }*/

    // 상속 가능
    /*protected Animal() {

    }*/

    // 바로 위에 기본 생성자 말고 매개변수가 포함된 생성자 만들면 Dog class에서 error
    // There is no default constructor available in 'ch2.item1.Animal'
    protected Animal(String name) {

    }
}

/*class Dog extends Animal {

}*/


interface Book {

    public static Book from() {
        return null;
    }
}