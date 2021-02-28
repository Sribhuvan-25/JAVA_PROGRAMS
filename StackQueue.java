package Queues;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stack1 = new Stack<>();   // Stack1 for adding item
    private Stack<Integer> stack2 = new Stack<>();  // Stack2 for deleting items

    public void enqueue(int item){   // O(1)
        stack1.push(item);
    }
    public int dequeue(){          // O(n)
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new IllegalStateException();
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new IllegalStateException();
        }
        if(!stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
}
