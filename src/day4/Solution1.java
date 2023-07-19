package day4;

import java.net.Inet4Address;
import java.util.*;

/**
 * @ClassName Solution1
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/18 7:49
 * @Version 1.0
 */
public class Solution1 {
//    public int[] maxSlidingWindow(int[] nums, int k) {
//
//        if(nums==null||nums.length<k){
//            return null;
//        }
//        int[] result=new int[nums.length-k+1];
//        Deque<Integer> queue=new LinkedList<>();
//
//
//        for (int i = 0; i < k; i++) {
//
//            if(queue.isEmpty()||queue.peek()<=nums[i]){
//
//                queue.addFirst(nums[i]);
//            }
//        }
//
//        for (int i = k; i < nums.length; i++) {
//            result[i-k]=queue.peekFirst();
//            if(queue.peekLast()==nums[i-k]){
//                queue.removeLast();
//            }
//
//
//            if(queue.isEmpty()){
//                for (int j = 0; j < k; j++) {
//                    if(queue.isEmpty()||queue.peek()<=nums[i-k+j]){
//                        queue.addFirst(nums[i]);
//                    }
//                }
//            }else {
//                if(queue.peekFirst()<=nums[i]){
//                    queue.addFirst(nums[i]);
//                }
//            }
//        }
//        result[nums.length-k]=queue.peekFirst();
//        return result;
//    }


    public int[] maxSlidingWindow(int[] nums, int k) {

        if(nums==null||nums.length<k){
            return null;
        }
        int[] result=new int[nums.length-k+1];
        Deque<Integer> queue=new LinkedList<>();


        for (int i = 0; i < k; i++) {

            while(!queue.isEmpty()&&queue.peekLast()<nums[i]){

                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            result[i-k]=queue.peekFirst();
            if(queue.peekFirst()==nums[i-k]){
                queue.removeFirst();
            }


            while(!queue.isEmpty()&&queue.peekLast()<nums[i]){

                queue.removeLast();
            }
            queue.addLast(nums[i]);
        }
        result[nums.length-k]=queue.peekFirst();
        return result;
    }
}
