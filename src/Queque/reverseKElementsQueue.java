package Queque;

import java.util.LinkedList;
import java.util.Queue;
import  java.util.Scanner;
import java.util.Stack;

public class reverseKElementsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println("Enter how many elements do you want to reverse between 0 to "+ q.size() );
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 1 ; i <= k ; i++){
            st.push(q.remove());
        }
        while (!st.empty()){
            q.add(st.pop());
        }
        for (int i = 1 ; i <= q.size() - k ; i++){
            q.add(q.remove());
        }
        System.out.println(q);

    }
}
