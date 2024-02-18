package CodeTop;

public class S7 {
    public int[] sortArray(int[] nums) {
        int heapSize = nums.length;
        buildHeap(nums,heapSize);
        for (int i = nums.length-1; i > 0; --i) {
            swap(nums,0,i);
            heapSize--;
            maxHeapify(nums,0,heapSize);
        }
        return nums;
    }

    private void buildHeap(int[] nums,int heapSize){
        for (int i = heapSize/2; i >= 0 ; --i) {
            maxHeapify(nums,i,heapSize);
        }
    }
    private void maxHeapify(int[] nums,int i,int heapSize){
        int left = 2*i+1,right = 2*i+2,largest = i;
        if((left< heapSize)&&nums[left]>nums[largest]){
            largest = left;
        }
        if((right< heapSize)&&nums[right]>nums[largest]){
            largest = right;
        }
        if(largest!=i){
            swap(nums,largest,i);
            maxHeapify(nums, largest,heapSize);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
//    public int[] sortArray(int[] nums) {
//        quickSort(nums,0, nums.length-1);
//        return nums;
//    }
//
//    private void quickSort(int[] nums,int left,int right){
//        int pivot = nums[left],i = left,j = right;
//        while(i<j){
//            while ((i<j)&&nums[i]<pivot){
//                i++;
//            }
//            while((i<j)&&nums[j]>pivot){
//                j--;
//            }
//            if((i<j)&&nums[i]==nums[j]){
//                i++;
//            }else {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//            }
//        }
//        if(i-1>left){
//            quickSort(nums,left,i-1);
//        }
//        if(i+1<right){
//            quickSort(nums,i+1,right);
//        }
//    }
}
