package leetcode;

public class Q136 {
    public static void main(String[] args) {
        int[] nums = { 4,1,2,1,2 };
        System.out.println(new Q136().singleNumber(nums));
    }
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        return xor;
    }
}
