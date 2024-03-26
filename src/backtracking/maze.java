package backtracking;

public class maze {
    public static void main(String[] args) {
        int row = 3 ;
        int column = 3 ;
        int count = noWays(1,1,row,column);
        System.out.println(count);
    }

    private static int noWays(int sr, int sc, int er, int ec) {
        if(sr > er || sc > ec ) return  0 ;
        if(sr == er && sc == ec) return 1;
        int downWays = noWays(sr+1,sc,er,ec);
        int rightWays = noWays(sr,sc+1,er,ec);
        return downWays + rightWays;
    }
}
