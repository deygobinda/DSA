package Recursion;

public class permutationStrings {

    public static void permutation(String ip , String op){
        if (ip.isEmpty()){
            System.out.println(op+" ");
            return;
        }
        for (int i = 0 ; i < ip.length(); i++){
            char ch = ip.charAt(i);
            String x = ip.substring(0,i);
            String y = ip.substring(i+1);
            permutation(x+y , op + ch);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        permutation(str,"");
    }
}
