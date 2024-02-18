package Stack;

import java.util.Stack;

public class infixToPostfix {

    static int precedence(char ch){
        if(ch == '+' || ch == '-'){
            return  1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else {
            return 0 ;
        }
    }

    static void process(Stack<String> post , Stack<Character> op){
        String v2 = post.pop();
        String v1 = post.pop();
        char ch = op.pop();
        String s = v1 + v2 + ch;
        post.push(s);
    }

    public static void main(String [] args){
        String infix = "9-(5+3)*4/6";
        int n = infix.length();
        Stack<String> post = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            char ch = infix.charAt(i);
            if(Character.isDigit(ch)){
                post.push(ch+"");
            }else if (ch == '('){
                op.push(ch);
            }else if (ch == ')') {
                while (op.peek() != '('){
                    process(post, op);
                }
                op.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.empty() && op.peek() != '(' && precedence(ch) <= precedence(op.peek())){
                    process(post, op);
                }
                op.push(ch);
            }
        }
        while(!op.empty()){
            process(post, op);
        }

        System.out.println(post.peek());

    }

}
