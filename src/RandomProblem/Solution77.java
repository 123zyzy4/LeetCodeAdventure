package RandomProblem;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution77 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {

        backtrack(n,k,1,new LinkedList<>());
        return res;
    }

    private void backtrack(int n, int k, int start, LinkedList<Integer> tmp){
        if(tmp.size() == k){
            res.add(new LinkedList<>(tmp));
            return;
        }
        for (int i = start; i <= n - (k - tmp.size()) + 1; i++) {
            tmp.add(i);
            backtrack(n,k,i+1,tmp);
            tmp.removeLast();
        }
    }

    @Test
    private void test(){
        combine(4,2);
    }
}
