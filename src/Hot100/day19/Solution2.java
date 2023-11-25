package Hot100.day19;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        for (int i = 1; i < numRows; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 1; j < list.size(); j++) {
                tmp.add(list.get(j-1)+list.get(j));
            }

            tmp.add(1);
            res.add(tmp);
            list = tmp;
        }
        return res;
    }

}
