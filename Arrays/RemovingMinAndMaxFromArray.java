package Arrays;

public class RemovingMinAndMaxFromArray {
    public static int minimumDeletions(int[] nums) {
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        if (minIndex > maxIndex) {
            int temp = maxIndex;
            maxIndex = minIndex;
            minIndex = temp;
        }

        int front = maxIndex + 1;
        int back = nums.length - minIndex;
        int bothSide = (minIndex + 1) + (nums.length - maxIndex);
        int ans = Math.min(front, Math.min(back, bothSide));
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 10, 7, 5, 4, 1, 8, 6 };

        int result = minimumDeletions(nums);

        System.out.println(result);
    }
}
