package Heap;

import java.util.ArrayList;
import java.util.List;

public class heapImplementation {

    private static void swap(List<Integer> li , int  a , int b){
        int temp = li.get(a);
        li.set(a,li.get(b));
        li.set(b,temp);
    }
    public static void min_insert(List<Integer> heap , int x){
        heap.add(x);
        int idx = heap.size()-1;
        int parentIdx = (idx - 1)/2;
        while (idx != 0 && heap.get(parentIdx) > heap.get(idx)){
            int temp = heap.get(idx);
            heap.set(idx , heap.get(parentIdx));
            heap.set(parentIdx,temp);
            idx = parentIdx;
            parentIdx = (idx - 1)/2;
        }
    }
    public static void max_insert(List<Integer> heap , int x){
        heap.add(x);
        int idx = heap.size()-1;
        int parentIdx = (idx - 1)/2;
        while (idx != 0 && heap.get(parentIdx) < heap.get(idx)){
            int temp = heap.get(idx);
            heap.set(idx , heap.get(parentIdx));
            heap.set(parentIdx,temp);
            idx = parentIdx;
            parentIdx = (idx - 1)/2;
        }
    }
    public static void minHeap_delete_node(List<Integer> minHeap){
        swap(minHeap,0,minHeap.size()-1);
        minHeap.remove(minHeap.size()-1);
        min_heapify(minHeap,0);
    }
    public static void maxHeap_delete_node(List<Integer> maxHeap){
        swap(maxHeap,0,maxHeap.size()-1);
        maxHeap.remove(maxHeap.size()-1);
        max_heapify(maxHeap,0);
    }
    public static void max_heapify(List<Integer> maxHeap, int idx){
        int n = maxHeap.size();
        if( idx >= n)  return ;
        int largest = idx;
        int left = (2 * idx) + 1;
        int right = (2 * idx) + 2;
        if(left < n && maxHeap.get(largest) < maxHeap.get(left)){
            largest = left;
        }
        if(right < n && maxHeap.get(largest) < maxHeap.get(right)){
            largest = right;
        }
        if(largest == idx) return;
        swap(maxHeap, largest, idx);
        max_heapify(maxHeap,largest);
    }
    public static void min_heapify(List<Integer> minHeap , int idx){
       int n = minHeap.size();
       if( idx >= n)  return ;
       int smallest = idx;
       int left = (2 * idx) + 1;
       int right = (2 * idx) + 2;
       if(left < n && minHeap.get(smallest) > minHeap.get(left)){
           smallest = left;
       }
       if(right < n && minHeap.get(smallest) > minHeap.get(right)){
            smallest = right;
       }
       if(smallest == idx) return;
       swap(minHeap,smallest , idx);
       min_heapify(minHeap,smallest);
    }
    public static void main(String[] args){
        List<Integer> minHeap = new ArrayList<>();
        minHeap.add(5);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(40);
        minHeap.add(50);
        minHeap.add(30);
        minHeap.add(60);
        List<Integer> maxHeap = new ArrayList<>();
        maxHeap.add(50);
        maxHeap.add(40);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(10);
        maxHeap.add(5);
//        System.out.println("Min heap");
//        System.out.println(minHeap);
//        min_insert(minHeap , 5);
//        minHeap_delete_node(minHeap);
//        System.out.println(minHeap);

        System.out.println("Max heap");
        System.out.println(maxHeap);
        //max_insert(maxHeap,60);
        maxHeap_delete_node(maxHeap);
        System.out.println(maxHeap);
    }
}
