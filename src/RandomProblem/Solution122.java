package RandomProblem;

public class Solution122 {
    //虽然过了但是显得我好蠢啊这样做，完全被买卖1给带偏了，这道题可以无限次买入卖出所以只要两天之间是涨的就加上，最后累加得到结果就ok了
    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE,max = 0;
        for (int price : prices) {
            min = Math.min(min,price);
            if(price-min>=max){
                max = Math.max(max,price-min);
            }else{
                res += max;
                min = price;
                max = 0;
            }

        }
        res += max;
        return res;
    }

}
