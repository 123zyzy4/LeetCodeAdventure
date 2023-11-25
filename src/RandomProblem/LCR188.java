package RandomProblem;

public class LCR188 {
    public int bestTiming(int[] prices) {
        int min = Integer.MAX_VALUE,max = 0;
        for (int price : prices) {
            min = Math.min(min,price);
            max = Math.max(max,price-min);
        }
        return max;
    }
}
