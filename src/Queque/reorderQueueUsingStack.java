package Queque;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class reorderQueueUsingStack {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st  = new Stack<>();
        for(int i = 1 ; i <= 8 ; i++){
            q.add(i);
        }
        while (q.size() != 4){
            st.push(q.remove());
        }

        while(!st.empty()){
            q.add(st.pop());
        }
        while (q.size() != 4){
            st.push(q.remove());
        }

        while (!st.empty()){
            q.add(st.pop());
            q.add(q.remove());

        }

        while (!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.empty()){
            q.add(st.pop());
        }

        System.out.println(q);


    }
}
