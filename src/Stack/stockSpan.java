package Stack;

import java.util.Stack;

public class stockSpan {
    public static void main(String[] args) {
        int[] stock = {100,80,60,70,60,75,85};
        int n = 7 ;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);
        for(int i = 1 ; i < n ; i++){
            while (!st.empty() && stock[st.peek()] < stock[i]){
                st.pop();
            }
            if (!st.empty()){
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        for (int i = 0 ; i < ans.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
