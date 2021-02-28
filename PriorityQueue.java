package Queues;
import java.util.Arrays;

public class PriorityQueue {
    private int[] array;
    private int count;
     public PriorityQueue(int size){
         array = new int[size];
     }
     public void add(int item){
         if(count == array.length){ throw new IllegalStateException(); }
         // To shift items
         int i;
         for(i = count-1; i>=0; i--){
             if(array[i]>item){
                 array[i+1]=array[i];
             }
             else{ break; }
         }
         array[i+1]=item;
         count++;
     }
     public int remove(){
         if(count==0){
             throw new IllegalStateException();
         }
         return array[--count];
     }
     public boolean isEmpty() {
         return count==0;
     }
     @Override
    public String toString(){
         return Arrays.toString(array);
     }
}
