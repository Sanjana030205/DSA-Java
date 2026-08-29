package Arrays;

public class RangeSumQuery {

    int[] prefix;

    public RangeSumQuery(int[] nums) {

        prefix = new int[nums.length];

        prefix[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[left - 1];
        }
    }

    public static void main(String[] args) {

        int[] nums = {4, 6, 2, 8, 3};

        RangeSumQuery obj = new RangeSumQuery(nums);

        System.out.println(obj.sumRange(1, 3));
        System.out.println(obj.sumRange(2, 4));
        System.out.println(obj.sumRange(0, 2));
    }
}