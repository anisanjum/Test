import java.util.Arrays;

public class ToLower {
        public char[] to_lower(char[] A) {
            for(int i = 0; i < A.length; i++){
                if('A' <= A[i] && A[i] <= 'Z'){
                    A[i] = (char) (A[i] + 32);
                }
            }
            return A;
        }

    public static void main(String[] args) {
        ToLower toLower = new ToLower();
        char[] A={'A','C','C','I','O','N'};
        char[] chars = toLower.to_lower(A);
        System.out.println(Arrays.toString(chars));
    }
}
