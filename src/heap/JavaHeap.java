package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class JavaHeap {

    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


    public static void minHeap(){
        int[] arr = {5,10,4,8,6,6,9,12};

        for(int i=0;i<arr.length ;i++) {
            minHeap.add(arr[i]);
        }

        System.out.println(minHeap.peek());
        minHeap.remove(9);

        while(!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+ " ");
        }
    }

    public static void maxHeap(){
        int[] arr = {5,10,4,8,6,6,9,12};

        for(int i=0;i<arr.length ;i++) {
            maxHeap.add(arr[i]);
        }


        maxHeap.remove(9);
        while(!maxHeap.isEmpty()){
            System.out.print(maxHeap.poll()+ " ");
        }
    }

    public static void main(String args[]){
        minHeap();System.out.println();
        maxHeap();
    }


}
