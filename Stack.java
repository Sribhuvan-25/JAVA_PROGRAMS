package Stacks;
import java.util.Arrays;

public class Stack {
    private int[] arr = new int[5];
    private int count;

    public void push(int item){
        if (count==arr.length){
            throw new StackOverflowError();
        }
        arr[count++]=item;
    }
    public int pop(){
        if(count==0){
            throw new IllegalStateException();
        }
        return arr[--count];
    }
    public int peek(){
        if(count==0){
            throw new IllegalStateException();
        }
        return arr[count-1];
    }
    public boolean isEmpty(){
        return count==0;
    }
    @Override
    public String toString(){
       var items =  Arrays.copyOfRange(arr,0,count);
       return Arrays.toString(items);
    }
}
