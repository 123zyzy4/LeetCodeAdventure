package day1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @ClassName test
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/14 9:24
 * @Version 1.0
 */
public class test {

        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(7, 6, 9, 4, 11, 6);

            // 自然排序
            Optional<Integer> max = list.stream().max(Integer::compareTo);
            // 自定义排序（从大到小排序）
            Optional<Integer> max2 = list.stream().max((o1, o2) -> o2 - o1);
            System.out.println("自然排序的最大值：" + max.get());
            System.out.println("自定义排序的最大值：" + max2.get());


            List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
// 获取对应的平方数
            List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        }


}
