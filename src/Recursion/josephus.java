package Recursion;

import java.util.ArrayList;

public class josephus {

    public static void position(int k , int curIdx , ArrayList<Integer> list){
        if (list.size() == 1) return;
        curIdx = (curIdx + k - 1 ) % list.size();
        list.remove(curIdx);
        position(k,curIdx,list);
    }
    public static void main(String [] args){
        int k = 7 ;
        int n = 40 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            list.add(i);
        }
        position(7,0,list);
        System.out.println(list);
    }
}
