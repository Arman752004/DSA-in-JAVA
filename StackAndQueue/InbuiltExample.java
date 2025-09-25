package StackAndQueue;
//import java.util.Stack;
// import java.util.LinkedList;
// import java.util.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltExample {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(45);
        // stack.push(2);
        // stack.push(9);
        // stack.push(18);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(3);
        // queue.add(6);
        // queue.add(5);
        // queue.add(19);
        // queue.add(1);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());


        Deque<Integer> deque = new ArrayDeque<>();      //Add or Remove from both the side
        deque.add(89);
        deque.addLast(78);
        deque.removeFirst();

    }    
}
