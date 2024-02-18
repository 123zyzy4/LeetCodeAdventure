package CodeTop;

public class S3 {
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] nums, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(nums, i, heapSize);
        }
    }

    public void maxHeapify(int[] nums, int i, int heapSize) {
        int left = i * 2 + 1, right = i * 2 + 2, largest = i;
        if (left < heapSize && nums[left] > nums[largest]) {
            largest = left;
        }
        if (right < heapSize && nums[right] > nums[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(nums, i, largest);
            maxHeapify(nums, largest, heapSize);
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

//    public int findKthLargest(int[] nums, int k) {
//        quickSort(nums,0, nums.length-1);
//        return nums[nums.length-k];
//    }
//    private void quickSort(int[] nums,int left,int right){
//        int i = left,j = right,pivot = nums[left];
//        while(i<j){
//            while((i<j)&&nums[j]>pivot){
//                j--;
//            }
//            while((i<j)&&nums[i]<pivot){
//                i++;
//            }
//            if((i<j)&&(nums[i]==nums[j])){
//                i++;
//            }else {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//            }
//
//        }
//
//        if(i-1>left){
//            quickSort(nums, left, i-1);
//        }
//        if(i+1<right){
//            quickSort(nums, i+1, right);
//        }
//    }




}
