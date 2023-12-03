package day18;

public class Solution2 {
    public boolean canJump(int[] nums) {

        if(nums.length==1){
            return true;
        }
        int canReach = 0;
        for (int i = 0; i < nums.length-1; ++i) {
            if(i<=canReach){
                canReach = Math.max(canReach,nums[i]+i);
            }
            if(canReach>= nums.length-1){
                return true;
            }
        }
        return false;
    }
}
