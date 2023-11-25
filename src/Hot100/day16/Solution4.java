package Hot100.day16;

import java.util.Stack;

public class Solution4 {
    public int largestRectangleArea(int[] heights){
        int[] left = new int[heights.length];
        int[] right= new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < heights.length; i++) {

            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }

        stack = new Stack<>();

        for (int i = heights.length-1; i >=0 ; i--) {

            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            right[i] = stack.isEmpty()? heights.length:stack.peek();
            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < heights.length; ++i) {
            ans = Math.max(ans, (right[i] - left[i] - 1) * heights[i]);
        }
        return ans;



    }

    //代码没问题但是超时了
//    public int largestRectangleArea(int[] heights) {
//        int height = 1;
//        int res = 0;
//        while(true){
//            int distance = 0;
//            int max=0;
//            int count = 0;
//            for (int i = 0; i < heights.length; i++) {
//                if(heights[i]>height){
//                    distance++;
//                    max = Math.max(max,distance);
//                }else {
//                    distance = 0;
//                    count++;
//                }
//            }
//            res = Math.max(res,max*height);
//            if(count==heights.length){
//                break;
//            }
//            height++;
//
//        }
//
//        return res;
//    }
}
