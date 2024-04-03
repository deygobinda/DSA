package Recursion;

import java.util.ArrayList;

public class generateBalancedParentheses {

    public static void generate(int op  , int cl , String str , ArrayList<String> list){
        if (op == 0 && cl == 0){
            list.add(str);
            return;
        }
        if (cl < op) return;
        if (op != 0){
            generate(op - 1, cl, str + "(", list);
        }
        generate(op, cl - 1, str + ")", list);
    }
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        generate(3,3,"",list);
        System.out.println(list);
    }
}
