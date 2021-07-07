package org.datastructure.simplestructures;


import org.datastructure.trees.utils.ArrayUtils;
import org.datastructure.trees.utils.HeapUtils;

/**
 * Priority queue implementation.
 * 
 * @author Ignas Lelys
 * @created Apr 18, 2011
 * 
 */
public class PriorityQueue {

    private int[] heap;

    private int heapSize = 0;

    public PriorityQueue() {
        //初始容量
        heap = new int[100];
    }

    //1
    public void insertElement(int element) {
        //heapSize=10
        heapSize++;
        //heap[10]=0
        heap[heapSize - 1] = Integer.MIN_VALUE;
        //10，1
        changeElementValue(heapSize - 1, element);
    }

    public void changeElementValue(int index, int newValue) {
        if (heap[index] > newValue) {
            throw new RuntimeException("New value is smaller than old one.");
        }
        heap[index] = newValue;
        while (index > 0 && heap[HeapUtils.getParent(index)] < heap[index]) {
            ArrayUtils.swap(heap, index, HeapUtils.getParent(index));
            index = HeapUtils.getParent(index);
        }
    }

    public int getElement() {
        return heap[0];
    }

    public int removeElement() {
        if (heapSize < 1) {
            throw new RuntimeException();
        }
        int maxElement = heap[0];
        heap[0] = heap[heapSize - 1];
        heapSize--;
        HeapUtils.maxHeapify(heap, 0, heapSize);
        return maxElement;
    }

}
