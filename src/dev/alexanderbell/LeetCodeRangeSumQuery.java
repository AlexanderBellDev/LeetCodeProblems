package dev.alexanderbell;

public class LeetCodeRangeSumQuery {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(numArray.sumRange(0,2));
    }

}
class NumArray {
    int[] nums = null;
    int[] prefixSum = null;
    public NumArray(int[] nums) {
        this.nums = nums;
        prefixSum = new int[this.nums.length];
        for (int i = 0; i < this.nums.length; i++) {
            prefixSum[i] = this.nums[i];
            if (i > 0)
                prefixSum[i] += prefixSum[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        int sum = prefixSum[j];
        if (i > 0)
            sum -= prefixSum[i - 1];
        return sum;
    }
}