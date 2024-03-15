package Hasmap;
import java.util.*;

public class HashMapImplementation {


    static class HashMap<k , v>{
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f ;
        private int n = 0 ;
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N){
            buckets = new LinkedList[N];
            for (int i = 0 ; i < buckets.length ; i++){
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunction(k key){
            int bi = key.hashCode();
            return (Math.abs(bi)) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll ,k key){
            for (int i =0 ;  i < ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private  void reHash(){
            LinkedList<Node>[] oldBucket = buckets;
            initBuckets(oldBucket.length * 2);
            n = 0 ;
            for (var bucket : oldBucket){
                for (var node : bucket){
                    put(node.key ,node.value);
                }
            }
        }
        private class Node{
            k key ;
            v value;
            Node(k key , v value){
                this.key = key ;
                this.value = value ;
            }
        }

        public HashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }
        public int size(){  // return size of hashmap
            return n;
        }

        public void put(k key , v value){ // insert or update
            int bi = HashFunction(key);
            LinkedList<Node> currentLinkedList = buckets[bi];
            int e = searchInBucket(currentLinkedList,key);
            if (e == -1){ // insert
                Node temp = new Node(key,value);
                currentLinkedList.add(temp);
                n++;
            }else { // updating
                currentLinkedList.get(e).value = value;
            }


            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                reHash();

            }

        }

        public v get(k key){ // gives the value
            int bi = HashFunction(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int e = searchInBucket(currentBucket,key);
            if(e != -1){
                return currentBucket.get(e).value;
            }
            return null;

        }

        public v remove(k key){ // remove and return the value
            int bi = HashFunction(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int e = searchInBucket(currentBucket,key);
            if(e != -1){
                v x = currentBucket.get(e).value;
                currentBucket.remove(e);
                n--;
                return x;
            }
            return null;
        }
    }
    public static void main(String[] args){
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);
        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("d"));
        System.out.println(mp.get("e"));

    }
}
