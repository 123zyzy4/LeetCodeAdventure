package Hot100.day21;

public class Solution2 {
    public int majorityElement(int[] nums) {
        int cur = nums[0];
        int num = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]==cur){
                num++;
            }else {
                num--;
                if(num==0){
                    cur = nums[i];
                    num = 1;
                }
            }
        }
        return cur;
    }
}
