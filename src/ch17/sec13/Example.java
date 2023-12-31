package ch17.sec13;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is  java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(s->s.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}
