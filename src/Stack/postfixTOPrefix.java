package Stack;

import java.util.Stack;
public class postfixTOPrefix {

    static void process(Stack<String> prefix , char ch){
        String v2 = prefix.pop();
        String v1 = prefix.pop();
        String s = ch + v1 + v2 ;
        prefix.push(s);
    }
    public static void main(String[] args){
        String postfix = "953+4*6/-";
        Stack<String> prefix = new Stack<>();
        int n = postfix.length();
        for(int i = 0 ; i < n ; i++){
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch)){
                prefix.push(ch+"");
            }else{
                process(prefix,ch);
            }
        }

        System.out.println(prefix.peek());


    }
}
