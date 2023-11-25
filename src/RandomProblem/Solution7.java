package RandomProblem;

public class Solution7 {
    public int reverse(int x) {

        int res = 0;
        while(x!=0){
            if(res>Integer.MAX_VALUE/10||res<Integer.MIN_VALUE/10){
                return 0;
            }
            res = res*10+x%10;
            x=x/10;
        }

        return res;

    }
//    public int reverse(int x) {
//
//        if(x<0){
//            return -reverse(-x);
//        }
//        if(x == 0){
//            return 0;
//        }
//        int[] nums = new int[100];
//        int index = 0;
//        while(x%10==0){
//            x = x/10;
//        }
//        while(x!=0){
//            nums[index] = x%10;
//            x = x/10;
//            index++;
//        }
//
//        int index2 = 0;
//        int res = 0;
//        while(index2!=index){
//            res = res*10+nums[index2];
//            index2++;
//        }
//        if(res>Integer.MAX_VALUE||res<Integer.MIN_VALUE){
//            return 0;
//        }
//        return res;
//
//    }
}
