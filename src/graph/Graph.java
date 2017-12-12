package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    /**
     *          0
     *         /|
     *        1-|--2
     *          |  |
     *          3  4
     */

    static int[][] adjMatrix = {{0,1,0,1,0} ,{1,0,1,0,0} , {0,1,0,0,1} , {1,0,0,0,0} , {0,0,1,0,0}};

    public static void bfs(int index){

        Queue<Integer> q = new LinkedList();
        boolean[] visited = new boolean[adjMatrix.length];
        for(int i=0;i<adjMatrix.length;i++)
            visited[i] = false;

        q.add(index);

        while(!q.isEmpty()){
            int p = q.remove();

            visited[p] = true;
            System.out.print(p + " ");

            for(int i=0;i<adjMatrix.length;i++){
                if( !visited[i] && adjMatrix[p][i] == 1 ){
                    q.add(i);
                }
            }
        }

    }



    public static void dfs(int index, boolean[] visited){
        System.out.print(index + " ");
        visited[index] = true;

        for(int i=0;i<adjMatrix.length;i++) {
            if (!visited[i] && adjMatrix[index][i] == 1) {
                dfs(i,visited);
            }
        }



    }

    public static void main(String args[]){
        bfs(1);System.out.println();
        bfs(4);System.out.println();

        boolean[] visited = new boolean[adjMatrix.length];
        for(int i=0;i<adjMatrix.length;i++)
            visited[i] = false;

        System.out.println("\nDFS ...");
        dfs(1,visited);System.out.println();

        for(int i=0;i<adjMatrix.length;i++)
        visited[i] = false;
        dfs(4,visited);
    }
}

