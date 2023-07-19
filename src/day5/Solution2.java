package day5;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/19 8:48
 * @Version 1.0
 */
public class Solution2 {
    public void rotate(int[] nums, int k) {

        int[] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i+k)% nums.length]=nums[i];
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
        return;
    }
}
