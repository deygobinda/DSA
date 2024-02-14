package Stack;

import java.util.*;



public class balancedBracket {

    static  boolean balancedBracket(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0;i < str.length(); i++){
            if (str.charAt(i) == '('){
                st.push('(');
            }else  {
                if (st.isEmpty()) return false;
                if (st.peek() == '('){
                    st.pop();
                }
            }
        }
        if (!st.isEmpty()) return false;
        return true;
    }

    static int numberOfBracketNeedToRemove(String str) {
        Stack<Character> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                st.push('(');
            } else {
                if (st.isEmpty()) {
                    ans++; // Fix: Add 1 to ans for each extra closing parenthesis
                } else {
                    st.pop();
                }
            }
        }

        return st.size() + ans;
    }
    public static void main(String[] args) {
        String str = "()(())((())))()";
        System.out.println(balancedBracket(str));;
        System.out.println(numberOfBracketNeedToRemove(str));
    }
}
