package InterviewPreparation;

public class M_UnionFind {
    private int[] parent;
    private int[] rank;
    public int find(int i){
        if(parent[i]!=i){
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }

    public void union(int i,int j){
        int rootI = find(i);
        int rootJ = find(j);
        if(rootI!=rootJ){
            if(rank[rootI]>rank[rootJ]){
                parent[rootJ] = rootI;
            }else if(rank[rootI]<rank[rootJ]){
                parent[rootI] = rootJ;
            }else {
                parent[rootJ] = rootI;
                rank[rootI]++;
            }
        }

    }
}
