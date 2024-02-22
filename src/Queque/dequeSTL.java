package Queque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class dequeSTL {
    public static void main(String[]args){
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> dql = new LinkedList<>();// bot array and linkedList work like same

        // If we use the same functions as Queue Deque will work like queue
//        dq.add(1);//1
//        dq.add(2);//1 2
//        dq.add(3);//1 2 3
//        dq.poll();//2 3
//        System.out.println(dq.peek());


        // Deque operations

        dq.addLast(1); // addLast add elements from Right side
        System.out.println(dq);
        dq.addLast(2);
        System.out.println(dq);
        dq.addLast(3);
        System.out.println(dq);
        dq.addLast(4);
        System.out.println(dq); // addLast add elements from Right side

        dq.removeFirst();
        System.out.println(dq); // addLast remove elements from left side
        dq.removeFirst();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);


        dq.addFirst(1);
        System.out.println(dq); // addLast add elements from Left side
        dq.addFirst(2);
        System.out.println(dq);
        dq.addFirst(3);
        System.out.println(dq);
        dq.addFirst(4);
        System.out.println(dq);

        System.out.println(dq.getFirst());// peek from left
        System.out.println(dq.getLast());// peek from right

        dq.removeLast();
        System.out.println(dq); // removes from left side
        dq.removeLast();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);



    }
}
