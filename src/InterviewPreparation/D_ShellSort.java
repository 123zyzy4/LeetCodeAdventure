package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class D_ShellSort {
    private void shellSort(int[] nums){
        int gap = nums.length/2;
        while(gap>0){
            for (int i = 1; i < nums.length; i++) {
                int index = i-gap;
                int cur = nums[i];
                while(index>=0&&nums[index]>cur){
                    nums[index+gap] = nums[index];
                    index = index -gap;
                }
                nums[index+gap] = cur;
            }
            gap = gap/2;
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
        shellSort(nums1);
        shellSort(nums2);
        shellSort(nums3);
        shellSort(nums4);
        shellSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
