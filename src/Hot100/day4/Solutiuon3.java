package Hot100.day4;

/**
 * @ClassName Solutiuon3
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/18 14:40
 * @Version 1.0
 */
public class Solutiuon3 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }

        int sum=0;
        int min=0;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            max=Math.max(max,sum-min);
            if(sum<min){
                sum=min;
            }

        }
        return max;
    }
}
