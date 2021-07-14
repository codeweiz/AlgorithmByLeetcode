package IntroductionToDataStructure.Day01;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,1};
        boolean b = solution.containsDuplicate(nums);
        System.out.println(b);
    }
    public static class solution {
        public static boolean containsDuplicate(int[] nums) {
            Map<Integer,Integer> hashmap = new HashMap();
            for (int num : nums) {
                int count = hashmap.getOrDefault(num, 0) + 1;
                hashmap.put(num, count);
                if (hashmap.get(num) > 1) {
                    return true;
                }
            }
            return false;
        }
    }
}
