package Stack;

import java.util.Stack;

public class infixEvaluation {
    public static void main(String[] args){
        String exp = "9-(5+3)*4/6";
        Stack<Character> op = new Stack<>();
        Stack<Integer> val = new Stack<>();

        for(int i = 0 ; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if (Character.isDigit(ch)){
                val.push(ch - '0');
            } else if(ch == '('){
                op.push(ch);
            } else if (ch == ')') {
                while (op.peek() != '('){
                    process(val, op);
                }
                op.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!op.empty() && precedence(ch) <= precedence(op.peek())){
                    process(val, op);
                }
                op.push(ch);
            }
        }

        while (!op.empty()){
            process(val, op);
        }

        System.out.println(val.peek());
    }

    public static void process(Stack<Integer> val, Stack<Character> op) {
        int val2 = val.pop();
        int val1 = val.pop();
        char operator = op.pop();

        if(operator == '+') val.push(val1 + val2);
        else if(operator == '-') val.push(val1 - val2);
        else if(operator == '*') val.push(val1 * val2);
        else if(operator == '/') val.push(val1 / val2);
    }

    public static int precedence(char op){
        if(op == '+' || op == '-'){
            return 1;
        } else if(op == '*' || op == '/'){
            return 2;
        } else {
            return 0;
        }
    }
}
