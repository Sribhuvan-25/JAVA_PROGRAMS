package D;
import java.util.Stack;
import java.util.Arrays;

public class Balance {
    public boolean balancecheck(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <= input.length()-1; i++) {
            if (isLeftBracket(input.charAt(i))) {
                stack.push(input.charAt(i));
            }
            if (isRightBracket(input.charAt(i))) {
                if(stack.empty()) return false;
                var top = stack.pop();
                if(bracketsMatch(top, input.charAt(i))
                ) return false;
            }

        }
        return stack.empty();
    }
    private boolean isLeftBracket(char ch){
       var leftBrackets= Arrays.asList('(','[','<','{');
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return (ch== ')' || ch== ']' || ch== '>' || ch== '}');
    }
    private boolean bracketsMatch(char left, char right){
        return  right == ')' &&   left != '(' ||
          right == '>' &&   left != '<' ||
          right == ']' &&   left != '[' ||
          right == '}' &&   left != ']';
    }

}
