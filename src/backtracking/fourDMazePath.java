package backtracking;

public class fourDMazePath {
    public static void main(String[] args) {
        int rows = 3 ;
        int cols = 3 ;
        boolean[][] isVisited = new  boolean[rows][cols];
        path(0,0,rows-1,cols-1,"",isVisited);
    }


    private static void path(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {

        if (sr < 0 || sc < 0){
            return;
        }
        if (sr > er || sc > ec){
            return;
        }

        if (isVisited[sr][sc]) return;

        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        path(sr+1,sc,er,ec,s+"R",isVisited);
        path(sr,sc+1,er,ec,s+"D",isVisited);
        path(sr-1,sc,er,ec,s+"U",isVisited);
        path(sr,sc-1,er,ec,s+"L",isVisited);
        isVisited[sr][sc] = false;

    }
}
