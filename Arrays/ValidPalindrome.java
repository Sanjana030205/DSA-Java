package Arrays;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        /*
        use s.length() method when using String
        use s.charAt() method to access the char in String
         */
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(s);

        System.out.println(result);
    }
}
