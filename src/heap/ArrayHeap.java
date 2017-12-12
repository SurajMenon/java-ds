package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayHeap {

    public static void heapify(List<Integer> arr){

        int nonLeafIndex = (arr.size()-1)/2;
        for(int i=nonLeafIndex;i>=0;i--){

            int one;
            if(arr.size()-1 < 2*i+2 )
                one = arr.get(2 * i + 1);
            else
                one = Math.min(arr.get(2 * i + 1), arr.get(2 * i + 2));

            int tmp = arr.get(i);
            if(tmp > one) {
                arr.set(i, one);
                if (arr.get(2 * i + 1) == one)
                    arr.set(2 * i + 1, tmp);
                else
                    arr.set(2 * i + 2, tmp);
            }
        }
    }

    public static int pop(List<Integer> arr){

        int ret = arr.get(0);

        arr.set(0,arr.get(arr.size()-1));
        arr.remove(arr.size()-1);

        int i = 0;
        while((2 * i + 1) < arr.size()) {

            int one;
            if(arr.size()-1 < 2*i+2 )
                one = arr.get(2 * i + 1);
            else
                one = Math.min(arr.get(2 * i + 1), arr.get(2 * i + 2));

            int tmp = arr.get(i);

            if(tmp > one) {
                arr.set(i, one);
                if (arr.get(2 * i + 1) == one) {
                    arr.set(2 * i + 1, tmp);
                    i = 2 * i + 1;
                }
                else {
                    arr.set(2 * i + 2, tmp);
                    i = 2 * i + 2;
                }
            }

            else
                break;
        }


        return ret;
    }

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>(Arrays.asList(5,10,4,8,6,6,9,12));
        heapify(arr);
        System.out.println(arr);

        while(arr.size() > 0){
            System.out.print(pop(arr) + " ");
        }
    }
}
