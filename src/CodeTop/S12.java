package CodeTop;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class S12 {
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int pivot ;
        while(left<right){
            pivot = (left+right)/2;
            if(nums[pivot]<nums[right]){
                right = pivot;
            }else {
                left = pivot+1;
            }
        }
        pivot = left;
        left = 0;
        right = nums.length-1;
        if(target<=nums[right]){
            return binarySearch(nums,target,pivot,right);
        }else {
            return binarySearch(nums,target,left,pivot-1);
        }


    }
    private int binarySearch(int[] nums, int target,int left,int right){
        int mid = 0;
        while(left<=right){
            mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;

    }

    @Test
    public void test(){
        search(new int[]{3,1},1);
    }
}
