package algorithms.no003;

/**
 * 3. 无重复字符的最长子串
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * @author zhanghuafa 2019-08-01 20:39
 */
public class Application {

    public static void main(String[] args) {

    }

    private static int lengthOfLongestSubString(String s) {
        int n = s.length();
        if (n <= 1) {
            return n;
        }
        char tmp = s.charAt(0);
        int i = 0, j = 0;
        while (i < n && j < n) {

        }
        return 0;
    }
}
