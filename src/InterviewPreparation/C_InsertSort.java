package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class C_InsertSort {
    private void insertSort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int index = i-1;
            int cur = nums[i];
            while(index>=0&&nums[index]>cur){
                nums[index+1] = nums[index];
                index--;
            }
            nums[index+1] = cur;

        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Test
    public void test(){
        int[] nums1 = {5, 3, 8, 2, 1};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {};
        int[] nums5 = {1};
        insertSort(nums1);
        insertSort(nums2);
        insertSort(nums3);
        insertSort(nums4);
        insertSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
