package Hot100.day5;

/**
 * @ClassName Solution3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/19 9:37
 * @Version 1.0
 */
public class Solution3 {
    public int[] productExceptSelf(int[] nums) {

        int[] res=new int[nums.length];
        int bottom=1,top=1;
        for (int i = 0; i < nums.length; i++) {
            res[i]=bottom;
            bottom*=nums[i];

        }
        for (int i = nums.length-1; i >=0; i--) {
            res[i]*=top;
            top*=nums[i];

        }
        return res;

    }
}
