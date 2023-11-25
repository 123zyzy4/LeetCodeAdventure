package day11;
import Hot100.day11.LRUCache;
import org.junit.Test;
import org.junit.Assert;

public class LRUCacheTest {


    @Test
    public void testLRUCache1() {
        // 创建LRUCache对象，容量为2
        LRUCache lRUCache = new LRUCache(2);

        // 插入键值对 [2, 1]
        lRUCache.put(2, 1);


        // 插入键值对 [1, 1]
        lRUCache.put(1, 1);



        lRUCache.put(2, 3);


        // 插入键值对 [4, 1]，此时键2应该被淘汰
        lRUCache.put(4, 1);


        // 预期返回-1
        Assert.assertEquals(-1, lRUCache.get(1));
        // 预期返回3
        Assert.assertEquals(3, lRUCache.get(2));
    }









    @Test
    public void testLRUCache2() {
        // 创建LRUCache对象，容量为2
        LRUCache lRUCache = new LRUCache(2);

        // 插入键值对 [1, 1]
        lRUCache.put(1, 1);



        // 插入键值对 [2, 2]
        lRUCache.put(2, 2);
        // 预期返回1
        Assert.assertEquals(1, lRUCache.get(1));

        // 插入键值对 [3, 3]，会导致键2被淘汰
        lRUCache.put(3, 3);
        // 预期返回-1
        Assert.assertEquals(-1, lRUCache.get(2));

        // 插入键值对 [4, 4]，会导致键1被淘汰
        lRUCache.put(4, 4);
        // 预期返回1
        Assert.assertEquals(-1, lRUCache.get(1));
        // 预期返回-1
        Assert.assertEquals(3, lRUCache.get(3));
        // 预期返回4
        Assert.assertEquals(4, lRUCache.get(4));
    }

    @Test
    public void testLRUCache3(){
        LRUCache lRUCache = new LRUCache(10);

        String[] operations = {
                "put", "put", "put", "put", "put", "put", "get", "put", "get", "get",
                "put", "get", "put", "put", "put", "get", "put", "get", "get", "get",
                "get", "put", "put", "get", "get", "get", "put", "put", "get", "put",
                "get", "put", "get", "get", "get", "put", "put", "put", "get", "put",
                "get", "get", "put", "put", "get", "put", "put", "put", "put", "get",
                "put", "put", "get", "put", "get", "get", "get", "put", "get", "get",
                "put", "put", "put", "put", "get", "put", "put", "put", "put", "get",
                "get", "get", "put", "put", "put", "get", "put", "put", "put", "get",
                "put", "put", "put", "get", "get", "get", "put", "put", "put", "put",
                "get", "put", "put", "put", "put", "put", "put", "put"
        };

        int[][] inputs = {
                {10}, {10, 13}, {3, 17}, {6, 11}, {10, 5}, {9, 10}, {13}, {2, 19}, {2}, {3}, {5, 25}, {8},
                {9, 22}, {5, 5}, {1, 30}, {11}, {9, 12}, {7}, {5}, {8}, {9}, {4, 30}, {9, 3}, {9}, {10},
                {10}, {6, 14}, {3, 1}, {3}, {10, 11}, {8}, {2, 14}, {1}, {5}, {4}, {11, 4}, {12, 24},
                {5, 18}, {13}, {7, 23}, {8}, {12}, {3, 27}, {2, 12}, {5}, {2, 9}, {13, 4}, {8, 18},
                {1, 7}, {6}, {9, 29}, {8, 21}, {5}, {6, 30}, {1, 12}, {10}, {4, 15}, {7, 22}, {11, 26},
                {8, 17}, {9, 29}, {5}, {3, 4}, {11, 30}, {12}, {4, 29}, {3}, {9}, {6}, {3, 4}, {1},
                {10}, {3, 29}, {10, 28}, {1, 20}, {11, 13}, {3}, {3, 12}, {3, 8}, {10, 9}, {3, 26},
                {8}, {7}, {5}, {13, 17}, {2, 27}, {11, 15}, {12}, {9, 19}, {2, 15}, {3, 16}, {1},
                {12, 17}, {9, 1}, {6, 19}, {4}, {5}, {5}, {8, 1}, {11, 7}, {5, 2}, {9, 28}, {1},
                {2, 2}, {7, 4}, {4, 22}, {7, 24}, {9, 26}, {13, 28}, {11, 26}
        };

        int[] expected_output = {
                -1, 19, 17, -1, -1, 5, 30, -1, 30, 12, -1, -1, 24, -1, -1, 18, -1, 18, -1, 30,
                5, 30, 30, -1, 12, -1, -1, -1, 29, -1, 18, 18, -1, -1, 20, -1, 18, 18, -1, -1,
                20, -1, -1, -1, -1, -1, -1, -1, 17, 22, -1, -1, -1, -1, 20, -1, -1, -1, -1, -1,
                -1, 20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1, -1, -1, -1, -1, -1, -1
        };

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("put")) {
                int key = inputs[i][0];
                int value = inputs[i][1];
                lRUCache.put(key, value);
            } else if (operations[i].equals("get")) {
                int key = inputs[i][0];
                int result = lRUCache.get(key);
                if (result != expected_output[i]) {
                    System.out.println("Test case failed at operation " + (i + 1));
                }
            }
        }

        System.out.println("All test cases passed.");
    }

}
