package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class H_CountingSort {
    //这里失败的原因是java是值传递的，nums = res只会导致nums指向res但是本来nums数组没改变，又没有返回值所以读原来nums的时候还是读的本来的数组
    private void countingSort_Fail(int[] nums){
        int[] minAndMax = getMinAndMax(nums);
        int min = minAndMax[0];
        int max = minAndMax[1];
        int[] countArr = new int[max-min+1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            countArr[nums[i]-min]++;
        }
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }
        for (int i = nums.length-1; i >= 0 ; i--) {
            int index = countArr[nums[i]-min]-1;
            res[index] = nums[i];
            countArr[nums[i]-min]--;
        }

        nums = res;

    }

    private int[] countingSort(int[] nums){
        int[] minAndMax = getMinAndMax(nums);
        int min = minAndMax[0];
        int max = minAndMax[1];
        int[] countArr = new int[max-min+1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            countArr[nums[i]-min]++;
        }
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i-1];
        }
        for (int i = nums.length-1; i >= 0 ; i--) {
            int index = countArr[nums[i]-min]-1;
            res[index] = nums[i];
            countArr[nums[i]-min]--;
        }

        return res;

    }
    private int[] getMinAndMax(int[] nums){
        int min = nums[0],max= nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return new int[]{min,max};
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
        int[] nums5 = {1};
//        nums1 = countingSort(nums1);
//        nums2 = countingSort(nums2);
//        nums3 = countingSort(nums3);
//        nums5 = countingSort(nums5);
        countingSort(nums1);
        countingSort(nums2);
        countingSort(nums3);
        countingSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums5));
    }
}
