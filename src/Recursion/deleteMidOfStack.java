package Recursion;

import java.util.Stack;

public class deleteMidOfStack {

    public  static void delete(Stack<Integer> st, int n){
        if (st.size() == n / 2){
            st.pop();
            return;
        }
        int x = st.pop();
        delete(st,n);
        st.push(x);
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
        delete(st,st.size()+1);
        System.out.println(st);
    }
}
