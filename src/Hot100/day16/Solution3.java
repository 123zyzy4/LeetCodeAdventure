package Hot100.day16;

import java.util.Stack;

public class Solution3 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            while(!stack.isEmpty()&&temperatures[stack.peek()]<temperature){
                int tmp = stack.pop();
                res[tmp] = i - tmp;
            }
            stack.push(i);
        }
        return res;

    }
}
