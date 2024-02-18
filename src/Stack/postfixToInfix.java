package Stack;

import java.util.Stack;

public class postfixToInfix {
    static void process(Stack<String> infix , char ch){
        String v2 = infix.pop();
        String v1 = infix.pop();
        String s =  '(' + v1 + ch + v2+')' ;
        infix.push(s);
    }
    public static void main(String[] args){
        String postfix = "953+4*6/-";
        Stack<String> infix = new Stack<>();
        int n = postfix.length();
        for(int i = 0 ; i < n ; i++){
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch)){
                infix.push(ch+"");
            }else{
                process(infix,ch);
            }
        }

        System.out.println(infix.peek());


    }
}
