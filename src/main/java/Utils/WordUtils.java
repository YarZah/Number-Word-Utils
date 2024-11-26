package Utils;
import java.util.regex.Pattern;

public class WordUtils {
    public static int countWordOccurrences(String sentence, String word) {
        if (sentence == null || word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Речення або слово порожнє.");
        }

        String regex = "\\b" + Pattern.quote(word) + "\\b";
        return (int) Pattern.compile(regex)
                .matcher(sentence)
                .results()
                .count();
    }
}