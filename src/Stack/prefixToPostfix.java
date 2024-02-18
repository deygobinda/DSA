package Stack;

import java.util.Stack;

public class prefixToPostfix {
    static void process(Stack<String> postfix , char ch){
        String v1 = postfix.pop();
        String v2 = postfix.pop();
        String s =  v1 + v2 + ch ;
        postfix.push(s);
    }
    public static void main(String[] args){
        String prefix = "-9/*+5346";
        Stack<String> postfix = new Stack<>();
        int n = prefix.length();
        for(int i = n-1 ; i >= 0 ; i--){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                postfix.push(ch+"");
            }else{
                process(postfix,ch);
            }
        }
        System.out.println(postfix.peek());


    }
}
