import java.util.Stack;

public class ValidParenthesis {

    public boolean isValidParenthesis(String input) {
        Stack<Character> bracketStack = new Stack<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                bracketStack.push('(');
            } else if (chars[i] == ')') {
                if (bracketStack.isEmpty()) {
                    return false;
                }
                bracketStack.pop();
            }
        }
        return bracketStack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
//        boolean isValid = vp.isValidParenthesis("())(()");//o/p should be invalid
        boolean isValid = vp.isValidParenthesis("((())())"); //o/p should be valid
//        boolean isValid = vp.isValidParenthesis("())"); //o/p should be invalid
        if (isValid) System.out.println("Valid");
        else System.out.println("InValid");
    }
}
