package Queque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class queSTL {
    public static void main(String[] args) {
        Queue <Integer> q = new ArrayDeque<>();
        Queue<Integer> qL  = new LinkedList<>();
        q.add(1); // to add at queue
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.poll(); // to remove from front
        System.out.println(q);
        q.remove();// to remove from front
        System.out.println(q);
        System.out.println(q.peek());// to find front of queue
        System.out.println(q.element());// to find front of queue
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }
}
