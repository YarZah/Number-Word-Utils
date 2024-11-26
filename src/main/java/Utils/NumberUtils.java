package Utils;
import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static List<Integer> multiplyOddNumbers(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Список чисел порожній.");
        }

        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                result.add(number * 2);
            } else {
                result.add(number);
            }
        }
        return result;
    }
}
