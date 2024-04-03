package Recursion;

public class more1Than0 {

    public static void prefix(int one , int zero , String op , int ip){
        if(one < zero)return;
        if (ip == 0){
            System.out.print(op+" ");
            return;
        }
        prefix(one+1,zero , op+'1',ip-1);
        prefix(one,zero+1 , op+'0',ip-1);
    }
    public static void main(String[] args) {
        prefix(0,0,"",5);
    }
}
