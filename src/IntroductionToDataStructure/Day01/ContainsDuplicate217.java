package IntroductionToDataStructure.Day01;

import java.util.HashMap;
import java.util.Map;

// 存在重复元素
public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,1};
        boolean b = solution.containsDuplicate(nums);
        System.out.println(b);
    }
    public static class solution {
        public static boolean containsDuplicate(int[] nums) {
            // 利用HashMap的特性，有重复元素插入时会更新原结点
            Map<Integer,Integer> hashmap = new HashMap();
            // 使用 foreach 循环，遍历数组nums所有元素
            for (int num : nums) {
                // HashMap使用 key:value 的方式存储
                // 如果hashmap存在num，就取出对应的 value 值，并加一
                // 如果hashmap不存在num，就取默认值 0 为 value 值，并加一
                int count = hashmap.getOrDefault(num, 0) + 1;
                // 将 num:count 存入 hashmap
                // 如果 key 值 num 重复，就覆盖 count 值为新的 value
                hashmap.put(num, count);
                // 这两行代码可以精简一下，去掉 count 中间变量
                // hashmap.put(num,hashmap.getOrDefault(num,0)+1);

                // 在循环体的最后，进行条件判断，以 num 为 key，调用 hashmap 的 get 方法，取出对应的 value 值
                // 如果此前没有重复元素，那对应的 value 值为 1
                // 如果此前有重复元素，那对应的 value 值为 2，大于 1
                // 检测出有重复元素，返回true
                if (hashmap.get(num) > 1) {
                    return true;
                }
            }
            // 如果循环遍历下来，依然没有重复元素，返回 false
            return false;
        }
    }
}
