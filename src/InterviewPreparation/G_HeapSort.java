package InterviewPreparation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class G_HeapSort {
    //大根堆,用于从小到大排序（把一个个最大的交换到数组最后面）
    //大小根堆区别就是heapify里面的两个if取小于还是大于
    int[] heap;
    int maxSize;
    int curSize;
    private void heapSort(int[] nums){
        this.heap = nums;
        curSize = nums.length;
        buildHeap();
        for (int i = nums.length-1; i > 0; i--) {
            swap(heap,0,i);
            curSize--;
            heapify(0);

        }

    }
    private void insert(int value){
        if (curSize == heap.length) {
            throw new IllegalStateException("Heap is full");
        }
        heap[curSize] = value;
        curSize++;
        heapifyUp(curSize - 1);
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index] > heap[parentIndex]) {
            swap(heap,index, parentIndex);
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    private void buildHeap(){
        for (int i = curSize/2; i >= 0 ; i--) {
            heapify(i);
        }
    }
        
    private void heapify(int i){
        int leftIndex = 2*i+1,rightIndex = 2*i+2,largest = i;
        if(leftIndex<curSize&&heap[leftIndex]>heap[largest]){
            largest = leftIndex;
        }
        if(rightIndex<curSize&&heap[rightIndex]>heap[largest]){
            largest = rightIndex;
        }

        if(largest!=i){
            swap(heap,i,largest);
            heapify(largest);
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
        heapSort(nums1);
        heapSort(nums2);
        heapSort(nums3);
        heapSort(nums4);
        heapSort(nums5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
        System.out.println(Arrays.toString(nums5));
    }
}
