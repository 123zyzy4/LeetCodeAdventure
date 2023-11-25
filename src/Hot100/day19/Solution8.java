package Hot100.day19;

public class Solution8 {
    public int maxProduct(int[] nums) {

        int neg = nums[0];
        int pos = nums[0];



        int max = pos;
        for (int i =1;i< nums.length;i++) {
            int neg_tmp = neg,pos_tmp = pos;

            neg = Math.min(nums[i],Math.max(nums[i]*neg_tmp,nums[i]*pos_tmp));
            pos = Math.max(nums[i],Math.max(nums[i]*neg_tmp,nums[i]*pos_tmp));
            max = Math.max(max,pos);
        }
        return max;

    }
//    public int maxProduct(int[] nums) {
//        if(nums.length==1){
//            return nums[0];
//        }
//        int[] neg = new int[nums.length];
//        int[] pos = new int[nums.length];
//        if(nums[0]>0){
//            pos[0] = nums[0];
//        }else {
//            neg[0] = nums[0];
//        }
//
//
//        int max = pos[0];
//        for (int i =1;i< nums.length;i++) {
//            if(nums[i]>0){
//                pos[i] = Math.max(pos[i-1]*nums[i],nums[i]);
//                neg[i] = neg[i-1]*nums[i];
//
//            }else {
//                pos[i] = neg[i-1]*nums[i];
//                neg[i] = Math.min(pos[i-1]*nums[i],nums[i]);
//            }
//
//            max = Math.max(max,pos[i]);
//        }
//        return max;
//
//    }
}
