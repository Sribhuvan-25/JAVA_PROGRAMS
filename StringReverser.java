package D;
import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        
        Stack<Character> stack = new Stack<>();
        if(input==null){
            throw new IllegalArgumentException();
        }

       // for(int i =0; i<input.length(); i++){
       //     stack.push(input.charAt(i));
       // }
        
        for(char ch : input.toCharArray()){
            stack.push(ch);
        }
        StringBuffer reveresed =  new StringBuffer();
        while(!stack.empty()){
            reveresed.append(stack.pop());
        }
        return reveresed.toString();
    }
}
