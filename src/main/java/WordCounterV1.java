import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class WordCounterV1 {
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

        // Initialize counts to 0
        for (String word : wordsToCount) {
            wordCounts.put(word.toLowerCase(), 0);
        }

        // Normalize text and split into words
        String[] tokens = text.toLowerCase().split("\\W+"); // Split by non-word characters

//        for (String token : tokens) {
//            System.out.println(token);
//        }

        // Count occurrences
        for (String token : tokens) {
            if (wordCounts.containsKey(token)) {
                wordCounts.put(token, wordCounts.get(token) + 1);
            }
        }

        return wordCounts;
    }
}

