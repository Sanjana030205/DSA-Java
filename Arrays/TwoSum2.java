package Arrays;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        /*Two Pointer Technique
        Array must be sorted to use this technique
        Sorted array + looking for a pair → think Two Pointers.
        */
        int left = 0;
        int right = numbers.length - 1;
        while(left<right)
        {
            int sum = numbers[left] + numbers[right];
            if(sum == target)
            {
                return new int[]{left+1, right+1};
            }
            else if(sum > target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
