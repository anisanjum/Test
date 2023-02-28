public class ReverseWordsOfString {

    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String tmp = arr[i];
            for (int j = tmp.length() - 1; j >= 0; j--) {
                sb.append(tmp.charAt(j));
            }
            sb.append(" ");

        }
        return sb.toString();
    }
}
