package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class B_SelectionSort {
    private void selectionSort(int[] nums){
        int min;
        int minIndex;
        for (int i = 0; i < nums.length-1; i++) {
            min = nums[i];
            minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j]<min){
                    min = nums[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                swap(nums,i,minIndex);
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
        selectionSort(nums1);
        selectionSort(nums2);
        selectionSort(nums3);
        selectionSort(nums4);
        selectionSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
