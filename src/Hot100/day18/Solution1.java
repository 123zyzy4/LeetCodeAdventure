package Hot100.day18;

public class Solution1 {

    public int maxProfit(int[] prices) {
        int max = 0,min = Integer.MAX_VALUE;
        for (int price : prices) {
            min = Math.min(min,price);
            max = Math.max(max,price-min);
        }
        return max;

    }

    //通过了但是很慢
//    public int maxProfit(int[] prices) {
//        int max = 0;
//        for (int i = 0; i < prices.length; i++) {
//
//            for (int j = i+1; j < prices.length; j++) {
//
//                int tmp = prices[j]-prices[i];
//                if(tmp<=0){
//                    break;
//                }
//                max= Math.max(max,tmp);
//            }
//        }
//        return max;
//
//    }
}
