package com.gmail.jarikzagreb16;
import Utils.NumberUtils;
import Utils.WordUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {

    @Test
    void testCountWordOccurrencesValidCase() {
        String sentence = "Я люблю Java. Я програмую на Java. Я маю виконувати дз вчастно";
        String word = "Java";
        int result = WordUtils.countWordOccurrences(sentence, word);
        assertEquals(2, result, "Кількість слів має бути 2.");
    }
}

class NumberUtilsTest {

    @Test
    void testMultiplyOddNumbersWithMixedList() {
        List<Integer> numbers = List.of(1, 15, 3, 7, 5);
        List<Integer> expected = List.of(2, 30, 6, 14, 10);
        List<Integer> result = NumberUtils.multiplyOddNumbers(numbers);
        assertEquals(expected, result, "Має бути [2, 30, 6, 14, 10].");
    }
}
