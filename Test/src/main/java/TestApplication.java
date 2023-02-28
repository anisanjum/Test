import java.util.List;

public class TestApplication {
    public static void main(String[] args) {
//        HashMap<MyKey, String> mp = new HashMap<>();
//        mp.put(new MyKey(101), "Key1");
//        mp.put(new MyKey(102), "Key2");
//        mp.put(new MyKey(103), "Key3");
//        mp.put(new MyKey(102), "Key4");
//        System.out.println(mp.size()); // time Complexity O(n)
//        System.out.println(mp.get(new MyKey(102))); // time Complexity O(n)
//        System.out.println("End of pgm");
//
//        //Addition using java 8
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        int result = numbers.stream().reduce(0, Integer::sum);
//        System.out.println("result: "+ result);
/////////////////////////////////////////////
//        List<Integer> intList = new ArrayList<>();
//        intList.add(2);
//        intList.add(7);
//        intList.add(9);
//        intList.add(5);
//        intList.add(3);
//        intList.add(4);
//        intList.add(2);
//        intList.add(6);
//        int input=2;
//        int count=0;
//
//        for(int i=0;i<intList.size();i++){
//            if(intList.get(i)==input) {
//                count++;
//                intList.remove(i);
//            }
//        }
//        for(int i=0;i<count;i++){
//            intList.add(input);
//        }
//        System.out.println("new array: "+intList);
///////////////////////////////////////////////////////////////////
//        String s = "Welcome to Accion";
//        String str = "Let's take LeetCode contest";
//        ReverseWordsOfString reverseWordsOfString = new ReverseWordsOfString();
//        String solution = reverseWordsOfString.solution(str);
//        System.out.print("ReverseWordsOfString: " + solution);
///////////////////////////////////////////
//        HammingDistance hammingDistance = new HammingDistance();
//        int hamdis = hammingDistance.hamdis(1, 3);
//        System.out.println("hammingDistance: " + hamdis);
///////////////////////////////////////////
//        List<String> letters = Arrays.asList("B", "A", "C");
//
//        List<String> reverseSortedLetters = letters.stream()
//                .sorted(Comparator.reverseOrder())
//                .collect(Collectors.toList());
//
//        System.out.println(reverseSortedLetters);
//////////////////////////////////////////////////////////////////////////////////////
//        String s= "ACCIONISHIRING";
//        int numRows=5;
//        ZigZagPattern zigZagPattern = new ZigZagPattern();
//        String output = zigZagPattern.zigZag(s, numRows);
//        System.out.println("ZigZagPattern: " + output);
//////////////////////////////////////////////////////////////////////////////////////
//        Palindrome palindrome = new Palindrome();
//        boolean palindromeSolution = palindrome.solution(199);
//        if (palindromeSolution == true) System.out.println("Is Palindrome");
//        else System.out.println("Not Palindrome");
//////////////////////////////////////////////////////////////////////////////////////
//        RomanToInteger romanToInteger = new RomanToInteger();
//        int x = romanToInteger.romanToInt("XVIII");
//        System.out.println("RomanToInteger: " + x);
//////////////////////////////////////////////////////////////////////////////////////
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int rdfsa = removeDuplicatesFromSortedArray.rdfsa(nums);
        System.out.println("RemoveDuplicatesFromSortedArray: " + rdfsa);
////////////////////////////////////////////////////////////////////////////
//        String str = "A man, a plan, a canal: Panama";
//        PalindromeString palindromeString = new PalindromeString();
//        boolean palindrome = palindromeString.isPalindrome(str);
//        if (palindrome == true) System.out.println(str + " is Palindrome");
//        else System.out.println(str + " not Palindrome");
//////////////////////////////////////////////////////////////////////////////////////

//        String input = "())(()";
//        Stack<Character> bracketStack = new Stack<>();
//        char[] chars = input.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == '(') {
//                bracketStack.push('(');
//            } else {
//                if (!bracketStack.isEmpty())
//                    bracketStack.pop();
//            }
//        }
//        if (bracketStack.isEmpty())
//            System.out.println("Valid");
//        else
//            System.out.println("InValid");
//////////////////////////////////////////////////////////////////////////////////////
//        List<Integer> listWithDuplicates=Lists.newArrayList(1,1,2,2,3,4,3);
//        List<Integer> listWithDuplicates = Arrays.asList(1, 1, 2, 2, 3, 4, 3);
//        List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());
//        System.out.println("listWithoutDuplicates: " + listWithoutDuplicates);
//////////////////////////////////////////////////////////////////////////////////////
        /*Given a list of numbers, square them and filter the numbers which are greater 1000 and
        then find average of them {100,24,13,44,114,200,40,112};*/

//        List<Integer> numList = Arrays.asList(100, 24, 13, 44, 1001, 1001, 1004, 2000);
//
//        numList.stream().map(i -> i * i)
//                .filter(j -> j > 1000)
//                .mapToInt(i -> i)
//                .average()
//               .ifPresent(avg -> System.out.println("average: " + avg));
//////////////////////////////////////////////////////////////////////////////////////////////
        /*Given a list of numbers, square them and filter the numbers which are greater 1000 and
        then arrange them in ascending order {100,24,13,44,114,200,40,112};*/

//        List<Integer> numList = Arrays.asList(100, 24, 13, 44, 1001, 1001, 1004, 2000);
//
//        List<Integer> collect = numList.stream().map(i -> i * i)
//                .filter(j -> j > 1000)
//                .sorted().collect(Collectors.toList());
//
//        System.out.println("collect: " + collect);
//////////////////////////////////////////////////////////////////////////////////////////////
//Remove the character 'C' or 'c' from the string
//        String s = "AccionCloudtech";
//        String finalStr = "";
//        for (int i = 0; i < s.length(); i++)
//            if (s.charAt(i) != 'C' && s.charAt(i) != 'c') {
//                finalStr = finalStr + s.charAt(i);
//            }
//        System.out.println("finalStr: " + finalStr);
//////////////////////////////////////////////////////////////////////////////////////////////
//Arrange the array such that even numbers first and then odd numbers
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        int index = 0;
//        int[] finalArr = new int[arr.length];
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] % 2 == 0) {
//                finalArr[index] = arr[i];
//                index++;
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] % 2 != 0) {
//                finalArr[index] = arr[j];
//                index++;
//            }
//        }
//        for (int j = 0; j < finalArr.length; j++)
//            System.out.print(finalArr[j] + ",");
/////////////////////////////////////////////////////////////////////////////////////
//        StringJoiner sj1 = new StringJoiner(",","[","]");
//        sj1.add("A").add("B").add("C");
//
//        StringJoiner sj2 = new StringJoiner(":");
//        sj2.add("P").add("Q").add("R");
//
//        sj1.merge(sj2);
//        System.out.println(sj1);
/////////////////////////////////////////////////////////////////////////////////////
//Intersection logic: finding the same elements from 2 arrays and printing them
//        int arr1[] = {80, 10, 15, 2, 35, 60};
//        int arr2[] = {35, 80, 60, 20, 75};
//
//        Set<Integer> s = new HashSet<>();
//
//        for (int i = 0; i < arr1.length; i++) {
//            s.add(arr1[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            if (s.contains(arr2[i]))
//                System.out.println(arr2[i] + " ");
//        }

        //Aliter
//        Set<Integer> finalArr = new HashSet<>();
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                if (arr1[i] == arr2[j]) {
//                    finalArr.add(arr1[i]);
//                    break;
//                }
//            }
//        }
//        System.out.println("finalArr: " + finalArr);
/////////////////////////////////////////////////////////////////////////////////////
//Union logic: removing the duplicates from both arrays and printing them
//        int arr3[] = {80, 10, 15, 2, 35, 60};
//        int arr4[] = {35, 80, 60, 20, 75};
//
//        Set<Integer> s1 = new HashSet<>();
//
//        for (int i = 0; i < arr3.length; i++) {
//            s1.add(arr3[i]);
//        }
//
//        for (int i = 0; i < arr4.length; i++) {
//            s1.add(arr4[i]);
//        }
//
//        System.out.println(s1 + " ");
/////////////////////////////////////////////////////////////////////////////////////
//    Reverse an integer 123456789

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//        int reverse = 0;
//        int remainder;
//        while (n > 0) {
//            remainder = n % 10;
//            reverse = reverse * 10 + remainder;
//            n = n / 10;
//        }
//        System.out.println("reverse number is: " + reverse);
/////////////////////////////////////////////////////////////////////////////////
        //Fibbonaci series with java 8
//        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
//                .limit(10)
//                .map(t -> t[0])
//                .forEach(x -> System.out.print(x+" "));
/////////////////////////////////////////////////////////////////////////////////////////
//       Palindrome with java 8
//        String text = "A man, a plan, a canal: Panama";
//        String temp  = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        boolean bool = IntStream.range(0, temp.length() / 2)
//                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));
//        if(bool)
//            System.out.println("Is Palindrome");
//        else
//            System.out.println("Not Palindrome");
////////////////////////////////////////////////////////////////////////////////////
        GenerateParenthesis test = new GenerateParenthesis();
        List<String> strings = test.generateParenthesis(2);
        System.out.println("strings: " + strings);
    }

}
