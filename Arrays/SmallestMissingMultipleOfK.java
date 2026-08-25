package Arrays;

import java.util.HashSet;

public class SmallestMissingMultipleOfK {
    public static int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        int multiple = k;
        while(set.contains(multiple))
        {
            multiple += k;
        }
        return multiple;
    }

    public static void main(String[] args) {
        int[] nums = {8,2,3,4,6,10};
        int k = 2;
        int res =missingMultiple(nums, k);
        System.out.println(res);
    }
}
