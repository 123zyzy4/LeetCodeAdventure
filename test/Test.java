public class Test {
    public static void main(String[] args) {
        int i = 10;
        int k = 10;
        boolean result = (i++ < k);
        System.out.println(result); // 输出：true
        System.out.println(i); // 输出：6

    }
}
