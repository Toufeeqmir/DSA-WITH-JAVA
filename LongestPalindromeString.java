
public class LongestPalindromeString {

    public static String LongestPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return " ";
        }  
        int start = 0, end = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            int len1 = substr(str, i, i);
            int len2 = substr(str, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        return str.substring(start, end + 1);

    }

    public static int substr(String str, int right, int left) {
        while (left >= 0 && right <= str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(LongestPalindrome(str));
    }

}
