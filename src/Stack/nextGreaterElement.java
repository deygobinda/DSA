package Stack;

import java.util.Stack;

public class nextGreaterElement {

    static  int[] greaterElements(int[] arr) {
        int[] res = new int[arr.length];
        res[arr.length - 1] = -1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        for (int i = arr.length-2; i >= 0 ; i-- ){
            while ( st.size()>0 && st.peek() < arr[i] ){
                st.pop();
            }
            if (st.isEmpty()) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }

        return res;

    }

    static void display(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,1,6,3,4};
        display(arr);
        int[] result = greaterElements(arr);
        display(result);
    }
}
