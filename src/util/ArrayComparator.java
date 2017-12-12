package util;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayComparator {

    static int[][] adjMatrix1 = { {1,2,3,4,5} , {5,6,7,8,9} , {4,5,6,7,8} , {1,1,0,1,1} , {1,0,0,1,0} , {0,0,0,0,0}};

    public static void main(String args[]){

        Comparator<int[]> c = new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                int sum1 = 0, sum2 = 0;
                for(int i=0;i<o1.length;i++){
                    sum1 += o1[i];
                    sum2 += o2[i];
                }

                return sum1-sum2;
            }
        };
        Arrays.sort(adjMatrix1,c);

        for (int i =0;i<adjMatrix1.length;i++){
            for(int j=0;j<adjMatrix1[i].length ; j++){
                System.out.print(adjMatrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
