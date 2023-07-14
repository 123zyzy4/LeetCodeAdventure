package day1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @ClassName Solution2
 * @Description TODO
 * @Author zhangyu
 * @Date 2023/7/13 15:25
 * @Version 1.0
 */
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map=new HashMap<>();
//        for (String str : strs) {
//            char[] chars = str.toCharArray();
//            Arrays.sort(chars);
//            String sorted=String.valueOf(chars);
//
//            if(map.containsKey(sorted)){
//                map.get(sorted).add(str);
//            }else {
//                List list=new ArrayList<>();
//                list.add(str);
//                map.put(sorted,list);
//            }
//        }
//        return new ArrayList<>(map.values());


        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
            char[] chars=str.toCharArray();
            Arrays.sort(chars);

            return new String(chars);
        })).values());




    }
}
