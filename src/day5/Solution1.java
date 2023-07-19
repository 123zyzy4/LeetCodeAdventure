package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/19 8:09
 * @Version 1.0
 */
public class Solution1 {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });


        List<int[]> list=new ArrayList<>();
        int[] last=intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0]<=last[1]&&intervals[i][0]>=last[0]){
                last=new int[]{last[0],Math.max(intervals[i][1],last[1])};
            }else {
                list.add(last);
                last=intervals[i];
            }
        }
        list.add(last);
        return list.toArray(new int[list.size()][]);
    }
}
