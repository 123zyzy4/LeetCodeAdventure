package Hot100.day21;

public class Solution3 {
    public void sortColors(int[] nums) {
        int p0 = 0,p2 = nums.length-1;
        for (int i = 0; i <=p2; i++) {
            while(i<=p2&&nums[i]==2){
                swap(nums,i,p2);
                p2--;
            }
            if(nums[i]==0){
                swap(nums,i,p0);
                p0++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
