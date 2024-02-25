package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class I_BucketSort {
    public static List<Integer> bucketSort(int[] arr, int bucket_size) {
        if (arr.length < 2 || bucket_size == 0) {
            return Arrays.stream(arr)
                    .boxed()  // 将基本数据类型转换为对应的包装类
                    .collect(Collectors.toList());
        }
        int[] extremum = getMinAndMax(arr);
        int minValue = extremum[0];
        int maxValue = extremum[1];
        int bucket_cnt = (maxValue - minValue) / bucket_size + 1;
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i < bucket_cnt; i++) {
            buckets.add(new ArrayList<Integer>());
        }
        for (int element : arr) {
            int idx = (element - minValue) / bucket_size;
            buckets.get(idx).add(element);
        }
        for (int i = 0; i < buckets.size(); i++) {
            if (buckets.get(i).size() > 1) {
                buckets.set(i, sort(buckets.get(i)));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (List<Integer> bucket : buckets) {
            for (int element : bucket) {
                result.add(element);
            }
        }
        return result;
    }

    private static List<Integer> sort(List<Integer> integers) {
        //doSort
        return integers;
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static int[] getMinAndMax(int[] nums){
        int min = nums[0],max= nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        return new int[]{min,max};
    }


    @Test
    public void test(){
        int[] nums1 = {5, 3, 8, 2, 1};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {5, 4, 3, 2, 1};
        int[] nums4 = {};
        int[] nums5 = {1};
//        bucketSort(nums1);
//        bucketSort(nums2);
//        bucketSort(nums3);
//        bucketSort(nums4);
//        bucketSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
