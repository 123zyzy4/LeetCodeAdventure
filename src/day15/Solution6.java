package day15;

public class Solution6 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (find(nums1, nums2,(n + m + 1) / 2,0,n-1,0,m-1) +find(nums1, nums2,(n + m + 2) / 2,0,n-1,0,m-1 )) * 0.5;


    }

    private int find(int[] nums1, int[] nums2,int k,int left1,int right1,int left2,int right2){


        int len1 = right1-left1+1;
        int len2 = right2-left2+1;
        if(len2<len1)return find(nums2, nums1, k, left2, right2, left1, right1);
        if(len1==0){
            return nums2[left2+k-1];
        }
        if(k==1){
            return Math.max(nums1[left1],nums2[left2]);
        }
        int i = left1+Math.min(len1,k/2)-1;
        int j = left2+Math.min(len2,k/2)-1;

        if(nums1[i]>nums2[j]){
            return find(nums1, nums2, k-(j-left2+1), left1, right1, j+1, right2);
        }else {
            return find(nums1, nums2, k-(i-left1+1), i+1, right1, left2, right2);
        }
    }

}
