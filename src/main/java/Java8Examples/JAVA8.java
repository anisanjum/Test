package Java8Examples;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JAVA8 {

//    https://medium.com/@veenaraofr/java8-stream-api-commonly-asked-questions-about-employee-highest-salary-99c21cec4d98

    public static void main(String[] args) {

        // Question: Write a Java program to find the second largest element in an array.
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 5));
        Optional<Integer> first = arr1.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("I am main...hahahahahahaha");
        JAVA8 j = new JAVA8();
        j.printRandomNum();


        // Write code to return the sum of square of even elements in a List using Streams API
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list
                .stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x * x)
                .sum();
        System.out.println("sum: " + sum);  // o/p:220

        //////////////////////////////////////////////////////////////////////////////////////////////////
        // find the length of the words which starts with b using Java 8
        List<String> list1 = Arrays.asList("Bou", "box", "Apple", "Bad", "bear");
        List<Integer> lengthList = list1
                .stream()
                .filter(x -> x.charAt(0) == 'B' || x.charAt(0) == 'b')
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("lengthList: " + lengthList);

        // Given a String s = "Girl is playing in the playground",
        // Find the count of each character using java8

        String s = "Girl is playing in the playground";

        // Count the frequency of each character
        Map<Character, Long> characterCount = s.chars()
                .mapToObj(c -> (char) c)  // Convert each int to a char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Output the results
        System.out.println("Character Count: ");
        characterCount.forEach((character, count) ->
                System.out.println(character + ": " + count)
        );

///////////////////////////////////////////////////////////////////////////
//        List<String> incomeRangeStr = Lists.of("Chris,10000", "John,5000", "Mathew,1000");
//        Income Range Low <= 1000
//        Income Range Medium <= 5000
//        Income Range High <= 10000
//        Income Range Very_High > 10000
//        Example output : {(Chris, High), (John, Medium), (Mathew, Low)}

        List<String> incomeRangeStr = Arrays.asList("Chris,10000", "John,5000", "Mathew,1000");

        Map<String, String> incomeRangeMap = incomeRangeStr.stream()
                .map(entry -> entry.split(","))
                .collect(Collectors.toMap(
                        entry -> entry[0],  // Name
                        entry -> categorizeIncome(Integer.parseInt(entry[1]))  // Income range
                ));

        System.out.println(incomeRangeMap);

        //////////////////////////////////////
        // Fibonacci using Java8
        // Generating Fibonacci sequence using Stream.iterate
        Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                .limit(10) // Limit to first 10 Fibonacci numbers
                .mapToLong(fib -> fib[0])
                .forEach(System.out::println);

        /////////////////////////////////////////////////////
        // Print the first nonrepeating character: String sentence = "Take a right for a quick exit";
        String sentence = "Take a right for a quick exit";
        // Convert to lowercase and remove spaces to focus on characters only
        String cleanSentence = sentence.toLowerCase().replaceAll("\\s", "");

        // Create a LinkedHashMap to store characters and their counts
        Map<Character, Long> charCountMap = cleanSentence.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        // Find the first entry with a count of 1
        Character firstNonRepeatingChar = charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        if (firstNonRepeatingChar != null) {
            System.out.println("The first non-repeating character is: " + firstNonRepeatingChar);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    private static String categorizeIncome(int income) {
        if (income > 10000) {
            return "Very_High";
        } else if (income <= 10000 && income > 5000) {
            return "High";
        } else if (income <= 5000 && income > 1000) {
            return "Medium";
        } else {
            return "Low";
        }
    }

    private static int findSquareOfMaxOdd(List<Integer> numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i % 2 != 0 && i > 3 && i < 11 && i > max) {
                max = i;
            }
        }
        return max * max;
    }

    // Aliter
    public static int findSquareOfMaxOddV1(List<Integer> numbers) {
        return numbers.stream()
                .filter(JAVA8::isOdd)        //Predicate is functional interface and
                .filter(JAVA8::isGreaterThan3)    // we are using lambdas to initialize it
                .filter(JAVA8::isLessThan11)    // rather than anonymous inner classes
                .max(Comparator.naturalOrder())
                .map(i -> i * i)
                .get();
    }

    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static boolean isGreaterThan3(int i) {
        return i > 3;
    }

    public static boolean isLessThan11(int i) {
        return i < 11;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    public static int sumWithCondition(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.parallelStream()
                .filter(predicate)
                .mapToInt(i -> i)
                .sum();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    public static void forEach(String[] args) {
        List<String> subList = new ArrayList<>();
        subList.add("Maths");
        subList.add("English");
        subList.add("French");
        subList.add("Sanskrit");
        subList.add("Abacus");
        System.out.println("------------Subject List--------------");
        subList.forEach(sub -> System.out.println(sub));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    // MAP Usage:
    public void iterateUsingLambda(Map<String, Integer> map) {
        map.forEach((k, v) -> System.out.println((k + ":" + v)));
    }

    public void iterateByKeysUsingLambda(Map<String, Integer> map) {
        map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));
    }

    public void iterateValuesUsingLambda(Map<String, Integer> map) {
        map.values().forEach(v -> System.out.println(("value: " + v)));
    }

    public void iterateUsingStreamAPI(Map<String, Integer> map) {
        map.entrySet().stream()
                // ... some other Stream processings
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    public void printRandomNum() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        numbers.stream().max(Integer::compareTo).ifPresent(System.out::println);
        Optional<Integer> first = numbers.stream().findFirst();
        System.out.println("first:" + first.get());
        numbers.stream()
                .max(Integer::compareTo)
                .ifPresent(max -> System.out.println("The maximum number is: " + max));
    }
}
