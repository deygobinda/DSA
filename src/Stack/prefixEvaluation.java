package Stack;
import java.util.Stack;
public class prefixEvaluation {
    public static void main(String[] args){
        String prefix = "-9/*+5346";
        Stack <Integer> st = new Stack<>();
        for(int i = prefix.length()-1; i >=0 ; i--){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                st.push(ch-'0');
            }else {
                int v1 = st.pop();
                int v2 = st.pop();
                if(ch == '+') st.push(v1 + v2);
                if(ch == '-') st.push(v1 - v2);
                if(ch == '*') st.push(v1 * v2);
                if(ch == '/') st.push(v1 / v2);
            }
        }
        System.out.println(st.peek());
    }
}
