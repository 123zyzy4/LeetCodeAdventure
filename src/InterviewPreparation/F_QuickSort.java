package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

//关注一下两个指针不动的情况，最好是直接记下来（这块没一下子写出来）
public class F_QuickSort {
    public void quickSort(int[] nums){
        if(nums==null||nums.length==0){
            return;
        }
        quickSort(nums,0,nums.length-1);
    }
    private void quickSort(int[] nums,int i,int j){
        int left = i,right = j;
        int pivot = nums[left];
        while(left<right){
            while(left<right&&nums[left]<pivot){
                left++;
            }
            while(left<right&&nums[right]>pivot){
                right--;
            }
            //不可能两个指针都不动，因为一定有一个指针就是pivot自身
            // 但是有一种情况，就是两个指针都是pivot的值，这时候需要认为left++，并且这个++需要两指针不重合
            if((left<right)&&nums[left]==nums[right]){
                left++;
            }else{
                swap(nums,left,right);
            }
        }
        if(i<left-1){
            quickSort(nums,i,left-1);
        }
        if(left+1<j){
            quickSort(nums,left+1,j);
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
        quickSort(nums1);
        quickSort(nums2);
        quickSort(nums3);
        quickSort(nums4);
        quickSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
