package InterviewPreparation;

import java.util.Arrays;

public class K_Dijkstra {

    private static final int INF = Integer.MAX_VALUE;
    public static void Dijkstra(int[][] graph,int start){
        int nodeNum = graph.length;
        boolean[] visited = new boolean[nodeNum];
        int[] distance = new int[nodeNum];
        Arrays.fill(distance,INF);
        distance[start] = 0;
        int[] parent = new int[nodeNum];
        parent[start] = -1;
        for (int i = 0; i < nodeNum; i++) {
            int minIndex = minDistance(distance,visited);
            visited[minIndex] = true;

            for (int j = 0; j < nodeNum; j++) {
                if(!visited[j]
                        &&graph[minIndex][j]!=0
                        && distance[minIndex]!=INF
                        &&distance[minIndex]+graph[minIndex][j]<distance[j]){
                    distance[j] =  distance[minIndex]+graph[minIndex][j];
                    parent[j] = minIndex;
                }
            }

        }


    }
    private static void printSolution(int start, int[] dist, int[] parent) {
        System.out.println("Vertex \t\t Distance \t\t Path");
        for (int i = 0; i < dist.length; i++) {
            if (i != start) {
                System.out.print(start + " -> " + i + " \t\t " + dist[i] + " \t\t ");
                printPath(i, parent);
                System.out.println();
            }
        }
    }
    private static void printPath(int currentVertex, int[] parent) {
        if (currentVertex == -1)
            return;
        printPath(parent[currentVertex], parent);
        System.out.print(currentVertex + " ");
    }
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INF;
        int minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }
}
