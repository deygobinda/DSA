package Queque;

import java.util.Queue;
import java.util.ArrayDeque;

public class printQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> tem = new ArrayDeque<>();
        for(int i = 1 ;  i <= 10 ; i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            tem.add(q.poll());
        }
        while(!tem.isEmpty()){
            System.out.print(tem.peek()+" ");
            q.add(tem.poll());
        }

    }
}
