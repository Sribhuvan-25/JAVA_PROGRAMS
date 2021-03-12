import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;


        public Node(int value) {  //Construct-er
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);      // Having a node without a value does not make sense
        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (first == null)
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        size++;
        return -1;
    }

    public boolean contains(int item) {
        return (indexOf(item) != -1);
    }

    public void deleteFirst() {
        if (first == null)
            throw new NoSuchElementException();
        
        var second = first.next; // [1 -> 2 -> 3]
        first = null; // [1  2 -> 3]
        first = second;
        size--;
    }

    public void deleteLast() {   // [1 -> 2 -> 3]
        if (first == null)
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        var previous = gprevious(last);  // [(previous)-> 2 ]
        last = previous;
        last.next = null;
        size--;
    }

    public Node gprevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }
 public void reverse(){
        if(first==null) return;
     var previous = first;
     var current = first.next;
     while(current!=null){                           // f         l
         var next = current.next;      // [1 -> 2 -> 3]
         current.next = previous;                   //   p <- c    n
         current = previous;                       //         p    c    n
         current = next;
     }                                            //               p    c    n
     last=first;
     last.next=null;
     first=previous;

 }
}
