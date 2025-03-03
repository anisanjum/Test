import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        // Example resume in string format
        String resume = "I have experience in Java8 and Spring Boot. I am proficient in String handling. "
                      + "My name is John Doe. I have worked on Java8 projects extensively, "
                      + "and my skills include String manipulation and advanced Java8 concepts.";

        // Words to count
        String[] wordsToCount = {"java8", "string", "name"};

        // Count occurrences
        Map<String, Integer> wordCounts = countWords(resume, wordsToCount);

        // Print results
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    private static Map<String, Integer> countWords(String text, String[] wordsToCount) {
        Map<String, Integer> wordCounts = new HashMap<>();

        // Normalize the text to lowercase
        String normalizedText = text.toLowerCase();

        // Initialize the word count map
        for (String word : wordsToCount) {
            wordCounts.put(word, 0);
        }

        // Count occurrences of each word
        for (String word : wordsToCount) {
            int count = 0;
            int index = normalizedText.indexOf(word.toLowerCase());

            while (index != -1) {
                count++;
                index = normalizedText.indexOf(word.toLowerCase(), index + word.length());
            }

            wordCounts.put(word, count);
        }

        return wordCounts;
    }
}
