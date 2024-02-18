package JianZhiOffer;

public class LCR106 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n]; // 用于标记节点的颜色，0 表示未被着色，1 和 -1 分别表示两种不同的颜色

        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, 1, i)) { // 如果当前节点未被着色，且从该节点开始的DFS返回false，则该图不是二分图
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int[][] graph, int[] colors, int color, int node) {
        if (colors[node] != 0) { // 如果节点已被着色
            return colors[node] == color; // 检查节点的颜色是否和期望的颜色相同，若相同返回true，否则返回false
        }

        colors[node] = color; // 将当前节点着色为 color

        for (int neighbor : graph[node]) {
            if (!dfs(graph, colors, -color, neighbor)) { // 对当前节点的邻居节点进行DFS，将期望的颜色设置为和当前节点相反的颜色（-color）
                return false; // 如果DFS返回false，则说明该图不是二分图
            }
        }

        return true; // 如果所有邻居节点DFS都返回true，则说明该图是二分图
    }
}
