package ch2.item2.javabeans;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setSize("grande");
        coffee.setMilk(50);
        coffee.setWhippedCream(true);

        System.out.println(coffee.toString()); // Coffee{size='grande', whippedCream=true, javaChip=false, milk=50}
    }
}


// 자바 빈즈
class Coffee {
    // 매개변수들은 기본 값이 있다면 기본값으로 초기화한다.
    private String size; // 필수; 기본값 없음
    private boolean whippedCream = false;
    private boolean javaChip = false;
    private int milk = 0;

    // 매개 변수가 없는 생성자로 객체 만든 후
    public Coffee() {
    }

    // setter
    public void setSize(String val) {
        this.size = val;
    }

    public void setWhippedCream(boolean val) {
        this.whippedCream = val;
    }

    public void setJavaChip(boolean val) {
        this.javaChip = val;
    }

    public void setMilk(int val) {
        this.milk = val;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "size='" + size + '\'' +
                ", whippedCream=" + whippedCream +
                ", javaChip=" + javaChip +
                ", milk=" + milk +
                '}';
    }
}