
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
 public static void main(String[] args) {
    //  stack
    // Stack<Integer> stack = new Stack<>();

    // stack.push(33);
    // stack.push(44);
    // stack.push(55);
    // stack.push(66);

    // System.out.println(stack.pop());

    // // queue

    // Queue<Integer> queue = new LinkedList<>();

    // queue.add(3);
    // queue.add(4);
    // queue.add(5);

    // System.out.println(queue.remove()); // removes first item 

    // deque

    Deque<Integer> deque = new ArrayDeque<>();

    deque.add(33);
    deque.addLast(44);
    deque.addFirst(22);

    System.out.println(deque.removeFirst());
 }   
}
