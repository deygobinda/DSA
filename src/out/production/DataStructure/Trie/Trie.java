package Trie;

public class Trie {
    static class  Node{
        Node[]  links = new Node[26];
        boolean flag = false;

        boolean containsKey(char ch){
            return links[ch - 'a'] != null;
        }
        void put(char ch , Node node){
            links[ch - 'a'] = node;
        }
        Node get(char ch){
            return links[ch - 'a'];
        }
        void setEnd(){
            flag = true;
        }

        boolean isEnd(){
            return flag ;
        }

    }

    private final Node root;
    public Trie(){
        root = new Node();
    }
    public void insert(String word){
        Node node = root;
        for(int i = 0 ; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch ,new Node());
            }
            node = node.get(ch);
        }
        node.setEnd();
    }

    public boolean search(String word){
        Node node = root;
        for(int i = 0 ; i < word.length(); i++){
            char ch = word.charAt(i);
            if(!node.containsKey(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix){
        Node node = root;
        for(int i = 0 ; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if(!node.containsKey(ch)){
                return false;
            }
            node = node.get(ch);
        }
        return true;
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("apps");
        trie.insert("apxl");
        System.out.println(trie.search("app"));
        System.out.println(trie.search("apple"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("appx"));
    }
}
