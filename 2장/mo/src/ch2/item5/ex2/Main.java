package ch2.item5.ex2;

public class Main {
    public static void main(String[] args) {

    }
}

class Lexicon {
}

// 예제 2. 싱글턴을 잘못 사용한 예 - 유연하지 않고 테스트 하기 어렵다.
class SpellChecker{
    private static final Lexicon dictionary = new Lexicon();

    private SpellChecker() { } // 객체 생성 방지
    public static SpellChecker INSTANCE = new SpellChecker();

    // public static boolean isValid(String word) { ... }
    // public static List<String> suggestions(String typo) { ... }
}