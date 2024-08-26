package Heap;

import java.util.ArrayList;
import java.util.List;

public class heapSort {

    // Method to convert the list into a min-heap
    public static void heapify(List<Integer> arr) {
        int firstNonLeafNode = (arr.size() - 2) / 2;
        for (int i = firstNonLeafNode; i >= 0; i--) {
            min_heapify(arr, i, arr.size());
        }
    }

    // Method to maintain the min-heap property
    public static void min_heapify(List<Integer> minHeap, int idx, int size) {
        int smallest = idx;
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < size && minHeap.get(smallest) > minHeap.get(left)) {
            smallest = left;
        }

        if (right < size && minHeap.get(smallest) > minHeap.get(right)) {
            smallest = right;
        }

        if (smallest != idx) {
            swap(minHeap, smallest, idx);
            min_heapify(minHeap, smallest, size);
        }
    }

    // Method to sort the list using heap sort
    public static void minHeapSort(List<Integer> minHeap) {
        heapify(minHeap);
        for (int i = minHeap.size() - 1; i > 0; i--) {
            swap(minHeap, 0, i);
            min_heapify(minHeap, 0, i); // heapify only the reduced heap
        }
    }

    // Swap elements at index a and b
    private static void swap(List<Integer> li, int a, int b) {
        int temp = li.get(a);
        li.set(a, li.get(b));
        li.set(b, temp);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(34);
        arr.add(30);
        arr.add(31);
        arr.add(42);
        arr.add(12);
        arr.add(23);

        System.out.println("Original array: " + arr);
        minHeapSort(arr);
        System.out.println("Sorted array: " + arr);
    }
}
