package ch2.item2.builder;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee.Builder("grande")
                .milk(50)
                .whippedCream(true)
                .build();

        System.out.println(coffee.toString());
        // Coffee{size='grande', whippedCream=true, javaChip=false, milk=50}
    }
}

// 빌더
class Coffee {
    private String size = "tall";
    private boolean whippedCream;
    private boolean javaChip;
    private int milk;

    public static class Builder {
        // 필수 매개변수
        private String size;

        // 선택 매개변수 - 기본값으로 초기화
        private boolean whippedCream = false;
        private boolean javaChip = false;
        private int milk = 0;

        public Builder(String size) {
            this.size = size;
        }

        // 각 입력 받은 매개변수마다 set하고 Builder 자기 자신을 반환하는 메서드를 만들어주면 된다.

        public Builder whippedCream(boolean val) {
            whippedCream = val;
            return this;
        }

        public Builder javaChip(boolean val) {
            javaChip = val;
            return this;
        }

        public Builder milk(int val) {
            milk = val;
            return this;
        }

        // 인스턴스화
        public Coffee build() {
            return new Coffee(this);
        }
    }

    // Builder class로 인스턴스화하는 생성자 필요
    private Coffee(Builder builder) {
        size = builder.size;
        whippedCream = builder.whippedCream;
        javaChip = builder.javaChip;
        milk =  builder.milk;
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