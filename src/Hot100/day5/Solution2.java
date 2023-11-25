package Hot100.day5;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/19 8:48
 * @Version 1.0
 */
public class Solution2 {
//    public void rotate(int[] nums, int k) {
//
//        int[] result=new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            result[(i+k)% nums.length]=nums[i];
//        }
//        System.arraycopy(result, 0, nums, 0, nums.length);
//        return;
//    }

    public void rotate(int[] nums, int k) {


        int count=0;
        k=k% nums.length;
        int start=0;
        while(count<nums.length){
            int cur=start;
            int pre=nums[start];
            do{
                int next=(cur+k)% nums.length;
                int temp=nums[next];
                nums[next]=pre;
                pre=temp;
                count++;
                cur=next;
            }while(cur!=start);


            start++;

        }
    }
    private void swap(int[] nums, int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }



//    public void rotate(int[] nums, int k) {
//
//        k %= nums.length;
//        reverse(nums, 0, nums.length - 1);
//        reverse(nums, 0, k - 1);
//        reverse(nums, k, nums.length - 1);
//
//    }
//
//
//    private void reverse(int[] nums,int start,int end){
//        while (start < end) {
//            int temp = nums[start];
//            nums[start] = nums[end];
//            nums[end] = temp;
//            start++;
//            end--;
//        }
//
//
//    }
}
