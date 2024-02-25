package RandomProblem;

public class ThrowTest {
    public static void main(String[] args) {
        throw new NullPointerException("抛出一个 NullPointerException");
//        try {
//            // 在 try 代码块中抛出异常
//            throwException();
//            System.out.println("这句代码不会被执行"); // 不会被执行
//        } catch (NullPointerException e) {
//            // 捕获并处理异常
//            System.out.println("捕获到 NullPointerException 异常");
//        }
//
//        System.out.println("程序继续执行");
    }

    // 定义一个方法，该方法抛出 NullPointerException 异常
    public static void throwException() {
        throw new NullPointerException("抛出一个 NullPointerException");
    }
}
