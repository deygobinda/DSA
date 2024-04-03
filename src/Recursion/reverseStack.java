package Recursion;

import java.util.Stack;

public class reverseStack {

    public static void insert(Stack<Integer> st , int element){
        if (st.isEmpty()){
            st.push(element);
            return;
        }
        int x = st.pop();
        insert(st,element);
        st.push(x);
    }

    public static void reverse(Stack<Integer> st){
        if (st.size() == 1) return;
        int x = st.pop();
        reverse(st);
        insert(st,x);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);
        st.push(7);
        st.push(5);
        st.push(8);
        st.push(6);
        st.push(10);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
