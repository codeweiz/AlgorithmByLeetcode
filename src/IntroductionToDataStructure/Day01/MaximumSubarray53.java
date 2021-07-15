package IntroductionToDataStructure.Day01;

public class MaximumSubarray53 {
    public static void main(String[] args) {
        int [] nums = new int[]{4,-1,1,2,1,-5,6,-7,9};
        System.out.println(Solution.maxSubArray(nums));
    }

    public static class Solution {
        // 动态规划
        public static int maxSubArray(int[] nums) {
            // 定义一个 pre，表示之前的总和
            int pre = 0;
            // 定义一个 maxAns，表示最大和
            int maxAns = nums[0];
            // foreach 循环，遍历一次 nums 数组
            for (int x : nums) {
                // 如果之前总和加上现在的值 x 后大于 x，说明原来的值 pre 小于 0，所以舍弃原来的值，使用 x 作为 新的 pre 值
                // 新的 pre 一定是 pre+x 和 x 之间最大的数
                pre = Math.max(pre+x,x);    // ***核心代码***
                // maxAns 的初始值为 nums[0]，pre 的初始值为 0
                // 如果 nums[0] 小于 0，一次循环后 maxAns 的值一定为 pre
                // 如果 nums[0] 大于0，一次循环后 maxAns 的值一定为 nums[0]
                // 这样一来，舍不舍弃 nums[0]，取决于 nums[0] 是否大于 0，也即，是否对 maxAns 有正向的贡献
                // 在一次循环之后，比的就是新的 pre 和旧的 pre 的值的大小
                maxAns = Math.max(maxAns,pre);
            }
            return maxAns;
        }
    }

}
