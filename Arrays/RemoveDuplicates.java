package Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1; i<nums.length; i++)
        {
            if(nums[i] != nums[i-1])
            {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int result =removeDuplicates(nums);
        System.out.println(result);
    }
}
