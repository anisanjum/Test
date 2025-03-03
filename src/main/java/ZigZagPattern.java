import java.util.Arrays;
import java.util.HashMap;

public class ZigZagPattern {

//    Example 1:
//    String s= "ACCIONISHIRING";
//    numRows=3;
//
//    A   O   H   N
//    C I N S I I G
//    C   I   R
//
//    o/p: AOHNCINSIIGCIR

////////////////////////////////////////////////////

// Example 2:
//String s= "ACCIONISHIRING";
//    numRows=4;
//
//    A     I     N
//    C   N S   I G
//    C O   H R
//    I     I
//
//    o/p: AINCNSIGCOHRII

////////////////////////////////////////////////////
//Example 3:
//    String s= "ACCIONISHIRING";
//    numRows=5;
//
//    A       H
//    C     S I
//    C   I   R
//    I N     I G
//    O       N
//
//    o/p: AHCSICIRINIGON
//////////////////////////////////////////////////////////////
//    https://leetcode.com/problems/zigzag-conversion/
//    Simple Solution: https://www.youtube.com/watch?v=MkopkN0L2EU
/////////////////////////////////////////////////////////////////////////

//    public String zigZag(String s, int n) {
//
//        if (n <= 1) {
////            return s;
//            System.out.println("zigzag string: " + s);
//        }
//
//        StringBuilder result = new
//                StringBuilder();
//
//        // Iterate rowNum from 0 to n - 1
//        for (int rowNum = 0; rowNum < n; rowNum++) {
//            int i = rowNum;
//            boolean up = true;
//
//            // Iterate i till s.length() - 1
//            while (i < s.length()) {
//                result = result.append(s.charAt(i));
//
//                // Check is rowNum is 0 or n - 1
//                if (rowNum == 0 || rowNum == n - 1) {
//                    i += (2 * n - 2);
//                } else {
//                    if (up) {
//                        i += (2 * (n - rowNum) - 2);
//                    } else {
//                        i += rowNum * 2;
//                    }
//                    up ^= true;
//                }
//            }
//        }
//        return result.toString();
//    }

    //////////////////////////////////////////////////////////////////////////////////////////
    //Aliter:
//    public String zigZag(String s, int numRows) {
//        if (numRows == 1) return s;
//
//        String ans = "";
//        int step = 2 * numRows - 2;
//        for (int i = 0;i < numRows; i++) {
//            for (int j = i; j < s.length(); j += step) {
//                ans += s.charAt(j);
//                if (i >= 1 && i <= numRows - 2 && j + (step - 2 * i) < s.length()) {
//                    ans += s.charAt(j + step - 2 * i);
//                }
//            }
//        }
//        return ans;
//    }
//////////////////////////////////////////////////////////////////////////////////////////
//    Simple Solution: https://www.youtube.com/watch?v=MkopkN0L2EU
    //Aliter:
    public String zigZag(String s, int numRows) {
        HashMap<Integer, String> hm = new HashMap<>();
        boolean increase = true;
        int row = 1;
        int index = 0;
        while (index < s.length()) {
            String curString = hm.getOrDefault(row, "");
            hm.put(row, curString + s.charAt(index++));
            if (increase) {
                row++;
                if (row == numRows) increase = false;
            } else if (!increase) {
                row--;
                if(row==1) increase=true;
            }
        }
        System.out.println("hm: "+hm);
        String ans = "";
        for(int r: hm.keySet()){
            ans = ans + hm.get(r);
        }
        return ans;
    }

    //ALITER:
//    public static String zigZag(String s, int numRows) {
//        if (numRows == 1) {
//            System.out.println(s);
//        }
//
//        char[] str = s.toCharArray();
//        int len = s.length();
//
//        boolean check = true;
//        String[] ar = new String[numRows];
//        Arrays.fill(ar, "");
//        int row = 0;
//        for (int i = 0; i < len; i++) {
//            ar[row] = ar[row] + str[i];
//            if (row == numRows - 1) {
//                check = false;
//            } else if (row == 0) {
//                check = true;
//            }
//            if (check) {
//                row++;
//            } else {
//                row--;
//            }
//        }
//        for (int i = 0; i < numRows; i++) {
//            System.out.print(ar[i]);
//        }
////        String finals = Arrays.toString(ar);
////        System.out.println(finals);
//
//        return null;
//    }
}
