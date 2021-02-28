package Queues;
import java.util.Arrays;

public class ArrayQueue {
  private  int[] array;
  public ArrayQueue(int size){
      array = new int[size];
  }
  private int f; // front
  private int r; // rear
  private int count;

  public void enqueue(int item){
      if(count==array.length){
          throw new IllegalStateException();
      }
      array[r]=item;
      r=(r+1) % array.length;                                              // Circular Array
      count++;                                                             // [0,0,10,20]
  }                                                                        //           r
  public int dequeue(){                                                    //[30,0,10,20]
                                                                           // r  f
      f = (f+1) % array.length;                                            // value of r:
      count--;                                                             // 5 -> 0; 6 -> 1; 7 -> 2; 8 -> 3; 9 -> 4;
      return array[f];                                                     //  10 -> 0; 11 -> 1
  }                                                                        // All the right side values are remainder
  public int peek(){
      return array[f];
  }                                   // (left side value / length)
  public boolean isEmpty(){
      return array.length==0;
  }
  public boolean isFull(){
      return array.length==5;
  }
  @Override
    public String toString(){
      var items = Arrays.copyOfRange(array,f,r);
      return Arrays.toString(items);
  }
}
