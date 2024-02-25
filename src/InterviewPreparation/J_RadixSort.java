package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J_RadixSort {
    private void radixSort(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        int N = 0;
        while(max>0){
            max = max/10;
            N++;
        }
        for (int i = 0; i < N; i++) {
            List<List<Integer>> radix = new ArrayList<>();
            for (int k = 0; k < 10; k++) {
                radix.add(new ArrayList<Integer>());
            }
            for (int num : nums) {
                int index = (int) (num/Math.pow(10,i)%10);
                radix.get(index).add(num);
            }
            int cur = 0;
            for (List<Integer> l : radix) {
                for (int n : l) {
                    nums[cur++] = n;
                }
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
        int[] nums1 = {15,23, 38, 12, 1};
        int[] nums2 = {61, 22, 783, 24, 95};
        int[] nums3 = {15, 94, 2223, 882, 1};
//        int[] nums4 = {};
        int[] nums5 = {1};
        radixSort(nums1);
        radixSort(nums2);
        radixSort(nums3);
//        radixSort(nums4);
        radixSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
//        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
