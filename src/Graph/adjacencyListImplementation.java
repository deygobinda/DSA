package Graph;

import java.util.LinkedList;

class  Graph{
    private int v ;// number of vertices
    private LinkedList<Integer> adj [];
    Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0 ; i < v ; i++){
            adj[i] = new LinkedList<>();
        }
    }
    void  addEdge(int v, int u){
        adj[v].add(u);
    }

    void printGraph(){
        for (int i = 0 ; i < v ; i++){
            System.out.println("The adjacency list of vertex " + i);
            System.out.print(i);
            for (Integer node : adj[i]){
                System.out.print(" -> "+ node);
            }
            System.out.println();
        }
    }
}

public class adjacencyListImplementation {

    public static void main(String[] args){
        Graph g = new Graph(7);
        // 0--1
        g.addEdge(0, 1);
        g.addEdge(1, 0);
        //0--2
        g.addEdge(0, 2);
        g.addEdge(2, 0);
        //1--2
        g.addEdge(1, 2);
        g.addEdge(2, 1);
        //1--3
        g.addEdge(1, 3);
        g.addEdge(3, 1);
        //2--4
        g.addEdge(2, 4);
        g.addEdge(4, 2);
        //3--4
        g.addEdge(3, 4);
        g.addEdge(4, 3);
        //5--6
        g.addEdge(5, 6);
        g.addEdge(6, 5);
        //4--5
        g.addEdge(4, 5);
        g.addEdge(5, 4);

        g.printGraph();
    }
}
