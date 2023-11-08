package day13;

import java.util.*;

public class Solution3 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] visit = new int[numCourses];
        if(countDistinctNumbers(prerequisites)==numCourses)return true;
        //先存储图的位置关系
        List<List<Integer>> adjacency = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        for (int[] cp : prerequisites) {
            //这里不会存在get不到，因为题目限制ai、bi小于numCourses
            adjacency.get(cp[1]).add(cp[0]);
        }

        //dfs
        for (int i = 0; i < numCourses; i++) {
            if(!dfs(i,visit,adjacency)){
                return false;
            }
        }
        return true;

    }

    private boolean dfs(int i,int[] visit,List<List<Integer>> adjacency){
        //-1代表着走到已经验证过没问题的区域了，直接ok
        if(visit[i]==-1){
            return true;
        }

        //遇到1只有一种可能，就是对当前节点dfs的时候绕回来了
        if(visit[i]==1){
            return false;
        }
        visit[i]=1;

        for(Integer j:adjacency.get(i)){
            if(!dfs(j, visit, adjacency))return false;
        }

        //切记把visit从1改为-1.要不其他人很难办
        visit[i]=-1;
        return true;
    }

    public static int countDistinctNumbers(int[][] prerequisites) {
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int[] prerequisite : prerequisites) {
            for (int num : prerequisite) {
                distinctNumbers.add(num);
            }
        }

        return distinctNumbers.size();
    }
}
