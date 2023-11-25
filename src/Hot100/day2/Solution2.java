package Hot100.day2;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 7:44
 * @Version 1.0
 */
public class Solution2 {
    public int maxArea(int[] height) {
        if(height==null||height.length==0)return 0;
        int left=0,right=height.length-1;
        int max=Math.min(height[left],height[right])*(right-left);
        while (right>left+1){
            if(height[right]<=height[left]){
                right--;
            }else {
                left++;
            }
            int cur=Math.min(height[left],height[right])*(right-left);
            max=Math.max(max,cur);
        }
        return max;
    }
}
