package InterviewPreparation;

import java.util.*;

public class L_TopologicalSort {
    //LeetCode202课程表
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] indegrees = new int[numCourses];
        for(int[] cp : prerequisites) {
            indegrees[cp[0]]++;
            adj.get(cp[1]).add(cp[0]);
        }
        for(int i = 0; i < numCourses; i++)
            if(indegrees[i] == 0) queue.add(i);

        while(!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for(int cur : adj.get(pre))
                if(--indegrees[cur] == 0) queue.add(cur);
        }

        return numCourses==0;

    }
}
