package Stack;


import java.util.Scanner;
import java.util.Stack;

public class basics {

    static void insertATLastIndex(Stack<Integer> st,int val){
        if (st.size() == 0){
            st.push(val);
            return;
        }
        int a = st.pop();
        insertATLastIndex(st,val);
        st.push(a);
    }

    static  void displayReverse(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverse(st);
        st.push(top);
    }
    static void  reverseStackRecursively(Stack<Integer> st){
        if (st.size() == 1) return;
        int top = st.pop();
        reverseStackRecursively(st);
        insertATLastIndex(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

//        System.out.println("Enter the size of stack");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("Enter the elements of stack ");
//        for(int i = 0 ; i < n ; i++){
//            st.push(sc.nextInt());
//        }
        System.out.println("The  stack is "+st);
//        System.out.println(st.pop());
//        insertATLastIndex(st,22);
//        System.out.println("The stack after insertion "+st);


//        System.out.print("The reversed Stack is ");
//        displayReverse(st);
//        System.out.println();


        //reversing the stack

//
//        Stack<Integer> newA = new Stack<>();
//        Stack<Integer> newB = new Stack<>();
//        while (st.size() != 0){
//            newA.push(st.pop());
//        }
//        while (newA.size() != 0){
//            newB.push(newA.pop());
//        }
//        while (newB.size() != 0){
//            st.push(newB.pop());
//        }
//        System.out.println("The reversed stack is "+st);
//        System.out.println();

        // reversing the stack again recursively
        reverseStackRecursively(st);
        System.out.println("The reversed stack is "+st);

       

    }
}
