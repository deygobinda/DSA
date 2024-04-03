package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class sizeSumHeight {
    public static class Node {
        int val; // 0
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }


    public static void levelOrder(Node root) {
        List<List<Integer>> res = new LinkedList<>();

        Queue<Node> q = new LinkedList<>();
        if (root == null) return;
        q.offer(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> sub = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                Node current = q.poll(); // Retrieve the front node
                if (current.left != null) q.offer(current.left);
                if (current.right != null) q.offer(current.right);
                sub.add(current.val);
            }
            res.add(sub);
        }

        System.out.println(res);
    }

    public  static int size(Node root){
        if (root == null) return  0 ;
        return  1 + size(root.left) + size(root.right);
    }

    public  static  int sumOfTreeNodes(Node root){
        if (root == null) return 0;
        return root.val + sumOfTreeNodes(root.left) +sumOfTreeNodes(root.right);
    }

    public  static int maxNode(Node root){
        if (root == null) return Integer.MIN_VALUE ;
        int sumMax = Math.max(maxNode(root.left) , maxNode(root.right));
        return Math.max(root.val,sumMax);
    }
    public  static int minNode(Node root){
        if (root == null) return Integer.MAX_VALUE ;
        int sumMin = Math.min(minNode(root.left) , minNode(root.right));
        return Math.min(root.val,sumMin);
    }

    public static int heightOfTree(Node root){
        if (root == null) return 0;
        if (root.right == null & root.left == null) return 0;
        return  1 + Math.max(heightOfTree(root.left) , heightOfTree(root.right));
    }

    public static int productOfNodes(Node root){
        if (root == null) return 1;
        return root.val * productOfNodes(root.right) * productOfNodes(root.left);
    }

    public  static void printNthLevel(Node root,int n){
        if(root == null) return;
        if (n==1) {
            System.out.print(root.val+" ");
            return;
        }
        printNthLevel(root.left,n-1);
        printNthLevel(root.right,n-1);
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        a.left = b;
        a.right = c;
        Node d = new Node(4);
        Node e = new Node(5);
        b.left = d;
        b.right = e;

        Node f = new Node(6);
        Node g = new Node(7);
        c.left = f;
        c.right = g;
//        levelOrder(a);
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sumOfTreeNodes(a));
//        System.out.println(maxNode(a));
//        System.out.println(heightOfTree(a));
//        System.out.println(minNode(a));
//        System.out.println(productOfNodes(a));

        for (int i = 1 ; i <= heightOfTree(a)+1; i++){
            printNthLevel(a,i);
            System.out.println();
        }
    }
}
