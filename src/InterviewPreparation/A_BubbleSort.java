package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class A_BubbleSort {
    private void bubbleSort(int[] nums){
        boolean flag;
        for (int i = 0; i < nums.length-1; i++) {
            flag = false;
            for (int j = 0; j < nums.length-i-1; j++) {

                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                    flag = true;
                }

            }
            if(flag == false){
                break;
            }

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
        bubbleSort(nums1);
        bubbleSort(nums2);
        bubbleSort(nums3);
        bubbleSort(nums4);
        bubbleSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
