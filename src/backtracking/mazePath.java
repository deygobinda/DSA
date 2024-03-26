package backtracking;

public class mazePath {
    public static void main(String[] args) {
        int rows = 3 ;
        int cols = 3 ;
        path(1,1,rows,cols,"");
    }

    private static void path(int sr, int sc, int er, int ec, String s) {
        if (sr > er || sc > ec){
            return;
        }
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        path(sr+1,sc,er,ec,s+"R");
        path(sr,sc+1,er,ec,s+"D");

    }
}
