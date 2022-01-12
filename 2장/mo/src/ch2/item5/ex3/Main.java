package ch2.item5.ex3;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
}

class Lexicon {
}

// 예제 3. 의존 객체 주입, 필요한 자원을 생성자를 통해서 주입 받음.
class SpellChecker{
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    // public static boolean isValid(String word) { ... }
    // public static List<String> suggestions(String typo) { ... }
}

/*
// Objects.java
public static <T> T requireNonNull(T obj) {
    if (obj == null)
        throw new NullPointerException();
    return obj;
}
 */