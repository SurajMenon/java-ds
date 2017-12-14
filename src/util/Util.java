package util;

import java.util.*;

public class Util {

    //int[][] arr = new int[3][10];
    //int[] arr = new int[3];

    public static Integer[] sortArray(Integer[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static Integer[] sortDecreasing(Integer[] arr){
        Arrays.sort(arr,Collections.reverseOrder());
        return arr;
    }

    public static void printArr(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void stack(){

        System.out.println("\nStacks ...");
        Stack<Integer> s = new Stack();
        s.push(5);s.push(10);s.push(15);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search(5));
    }

    public static void xor(){
        System.out.println("\nXor ...");
        int x=2,y=4;
        System.out.println(x ^ y);
        System.out.println(x ^ x);
    }

    public static void list(){
        System.out.println("\nList ...");
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,4,5,2,1));
        Collections.sort(arr);
        System.out.println(arr);

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    }

    public static void main(String args[]){
        Integer[] arr = {5,12,6,18,3,9,45,8,15};
        printArr(sortArray(arr));
        printArr(sortDecreasing(arr));

        stack();
        xor();
        list();
    }

    public void scannerEx(){
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
    }
}
