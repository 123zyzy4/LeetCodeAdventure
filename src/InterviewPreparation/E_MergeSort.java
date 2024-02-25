package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

//主函数如何分成两份再递归那一块稍微不是很熟练，合并的很熟练
public class E_MergeSort {
    private int[] mergeSort(int[] nums){
        if(nums.length == 1) {
            return nums;
        }
        int mid = nums.length/2;
        int[] left = Arrays.copyOfRange(nums,0, mid);
        int[] right = Arrays.copyOfRange(nums,mid, nums.length);
        return merge(mergeSort(left),mergeSort(right));


    }
    private int[] merge(int[] left,int[] right){
        int[] res = new int[left.length+right.length];
        int leftIndex = 0,rightIndex = 0;
        int cur = 0;
        while(leftIndex<left.length&&rightIndex<right.length){
            if(left[leftIndex]<=right[rightIndex]){
                res[cur] = left[leftIndex];
                cur++;
                leftIndex++;
            }else {
                res[cur] = right[rightIndex];
                cur++;
                rightIndex++;
            }
        }
        while(leftIndex<left.length){
            res[cur] = left[leftIndex];
            cur++;
            leftIndex++;
        }
        while(rightIndex<right.length){
            res[cur] = right[rightIndex];
            cur++;
            rightIndex++;
        }
        return res;
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
//        int[] nums4 = {};
        int[] nums5 = {1};
        nums1 = mergeSort(nums1);
        nums2 = mergeSort(nums2);
        nums3 = mergeSort(nums3);
//        nums4 = mergeSort(nums4);
        nums5 = mergeSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
//        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
