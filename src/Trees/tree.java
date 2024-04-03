package Trees;

import java.util.*;

public class tree {

    static class node{
        int data ;
        node left ;
        node right;

        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node buildTree(node root) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new node(data);

        System.out.println("Enter data for inserting at left node " + data);
        root.left = buildTree(root.left);
        System.out.println("Enter data for inserting at right node " + data);
        root.right = buildTree(root.right);
        return root;
    }
    public  static void inorder(node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public  static void preorder(node root){
        if (root == null) return;
        System.out.print(root.data+" ");
        inorder(root.left);
        inorder(root.right);
    }

    public  static void postorder(node root){
        if (root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.data+" ");

    }

    public static List<Integer> inorderTraversal(node root) {
        Stack<node> st = new Stack<>();
        List<Integer> res = new ArrayList<>();

        node curr = root;

        while (curr != null || !st.isEmpty()) {
            while (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            curr = st.pop();
            res.add(curr.data);
            curr = curr.right;
        }
        return res;
    }

    public static List<List<Integer>> levelOrder(node root){
        List<List<Integer>> list = new LinkedList<>();

        Queue<node> q = new LinkedList<>();
        if (root == null) return list;

        q.offer(root);

        while(!q.isEmpty()){
            int len = q.size();
            List<Integer> sub = new LinkedList<>();
            for (int i  = 0 ; i < len ;i++){
                if(q.peek().left != null) q.offer(q.peek().left);
                if(q.peek().right != null) q.offer(q.peek().right);
                sub.add(q.poll().data);
            }
            list.add(sub);

        }
        return list;
    }

    public static void main(String[] args) {
        node root = null;
        root = buildTree(root);
        System.out.println("The inorder traversal of tree is : ");
        inorder(root);
        System.out.println("The preorder traversal of tree is : ");
        preorder(root);
        System.out.println("The postorder traversal of tree is : ");
        postorder(root);
        System.out.println("The levelOrder traversal of tree is : ");
        List<List<Integer >> ans  = levelOrder(root);
        System.out.println(ans);


    }
}
