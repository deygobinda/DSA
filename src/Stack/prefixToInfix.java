package Stack;

import java.util.Stack;

public class prefixToInfix {
    static void process(Stack<String> infix , char ch){
        String v1 = infix.pop();
        String v2 = infix.pop();
        String s = "("+ v1 +ch+ v2+ ")";
        infix.push(s);
    }
    public static void main(String[] args){
        String prefix = "-9/*+5346";
        Stack<String> infix = new Stack<>();
        int n = prefix.length();
        for(int i = n-1 ; i >= 0 ; i--){
            char ch = prefix.charAt(i);
            if(Character.isDigit(ch)){
                infix.push(ch+"");
            }else{
                process(infix,ch);
            }
        }
        System.out.println(infix.peek());


    }
}
