package day2;

/**
 * @ClassName Solution4
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/15 9:45
 * @Version 1.0
 */
public class Solution4 {
//    public int trap(int[] height) {
//        if(height==null||height.length==0)return 0;
//        int left=0,right= height.length-1;
//        int sum=0;
//        int weakness=0;
//        while (left<right){
//            weakness=Math.min(height[left], height[right])-weakness;
//
//            sum+=weakness*(right-left);
//            for (int i = left+1; i < right; i++) {
//                sum-=Math.min(height[i],weakness);
//            }
//            while (left<right&&height[--right]>height[right]);
//            while (left<right&&height[++left]>height[left]);
//
//
//
//        }
//        return sum;
//    }


//    public int trap(int[] height) {
//        if(height==null||height.length==0)return 0;
//        int sum=0;
//        int left=0,right= height.length-1;
//        int[] leftMax=new int[height.length];
//        int[] rightMax=new int[height.length];
//
//        leftMax[0]=height[0];
//        rightMax[height.length-1]=height[height.length-1];
//
//        for (int k = 1; k < height.length; k++) {
//            leftMax[k]=Math.max(height[k],leftMax[k-1]);
//        }
//
//        for (int k = height.length-2; k >=0 ; k--) {
//            rightMax[k]=Math.max(height[k],rightMax[k+1]);
//        }
//
//
//        for (int k = 0; k < height.length; k++) {
//            sum+=Math.min(leftMax[k],rightMax[k])-height[k];
//        }
//
//
//        return sum;
//    }


//    public int trap(int[] height) {
//        if(height==null||height.length==0)return 0;
//        int sum=0;
//        int left=0,right= height.length-1;
//        int[] leftMax=new int[height.length];
//        int[] rightMax=new int[height.length];
//
//        leftMax[0]=height[0];
//        rightMax[height.length-1]=height[height.length-1];
//
//        for (int k = 1; k < height.length; k++) {
//            leftMax[k]=Math.max(height[k],leftMax[k-1]);
//        }
//
//        for (int k = height.length-2; k >=0 ; k--) {
//            rightMax[k]=Math.max(height[k],rightMax[k+1]);
//        }
//
//
//        for (int k = 0; k < height.length; k++) {
//            sum+=Math.min(leftMax[k],rightMax[k])-height[k];
//        }
//
//
//        return sum;
//    }
        public int trap(int[] height){
            if(height==null||height.length==0)return 0;
            int sum=0;
            int left=0,right= height.length-1;
            int leftMax=height[left], rightMax=height[right];

            while(left<right){

                leftMax = Math.max(leftMax, height[left]);
                rightMax = Math.max(rightMax, height[right]);


               if(height[left]<height[right]){
                   sum+=leftMax-height[left];
                   left++;

               }else {
                   sum+=rightMax-height[right];
                   right--;
               }
            }
            return sum;
        }

}
