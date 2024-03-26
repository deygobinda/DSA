package Recursion;



import java.util.Stack;

public class sortStack {



    public static void sort(Stack<Integer> st){
        if (st.isEmpty()) return;
        int ele = st.pop();
        sort(st);
        insert(st,ele);
    }

    private static void insert(Stack<Integer> st, int ele) {
        if (st.isEmpty() || st.peek() <= ele){
            st.push(ele);
            return;
        }
        int x = st.pop();
        insert(st,ele);
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
        st.push(5);
        st.push(6);
        st.push(10);
        st.push(9);
        System.out.println(st);
        sort(st);
        System.out.println(st);
    }
}
