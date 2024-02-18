package Hot100.day18.day17;

public class Solution1 {
    public int findKthLargest(int[] nums, int k){
        int heapSize = nums.length;
        buildHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --heapSize;
            modify(nums, 0, heapSize);
        }
        return nums[0];


    }

    private void buildHeap(int[] nums, int heapSize){
        for (int i = heapSize/2; i >=0 ; i--) {
            modify(nums,i,heapSize);
        }
    }

    private void modify(int[] nums, int i, int heapSize){
        int father = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<heapSize&&nums[left]>nums[father]){
            father = left;
        }
        if(right<heapSize&&nums[right]>nums[father]){
            father = right;
        }

        if(father!=i){
            swap(nums,i,father);
            modify(nums, father, heapSize);
        }

    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
