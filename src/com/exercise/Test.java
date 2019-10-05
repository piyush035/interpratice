package com.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        Predicate<String> p = (s) -> s.startsWith("G");
        for (String st : names) {
            if (p.test(st))
                System.out.println(st);
        }
    }
}
