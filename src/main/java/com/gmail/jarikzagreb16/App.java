package com.gmail.jarikzagreb16;

import java.util.List;

import static Utils.NumberUtils.multiplyOddNumbers;
import static Utils.WordUtils.countWordOccurrences;

public class App {
    public static void main(String[] args) {
//        String sentence = "Я люблю Java. Я програмую на Java. Я маю виконувати дз вчастно.";
//        String word = "Java";
//
//        int occurrences = countWordOccurrences(sentence, word);
//        System.out.println(sentence);
//        System.out.println("Кількість слова \"" + word + "\": " + occurrences);
        List<Integer> numbers = List.of(1, 15, 3, 7, 5);

        List<Integer> result = multiplyOddNumbers(numbers);
        System.out.println("Результат: " + result);
    }

}
