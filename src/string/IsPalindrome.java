package string;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 验证回文字符串
 * @Date 2018/9/28 9:47
 **/
public class IsPalindrome {

    @Test
    public void test() {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
    }

    private static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        int startIndex = 0;
        int endIndex = s.length() - 1;

        while (startIndex < endIndex && startIndex < s.length() - 1) {
            char pre = s.charAt(startIndex);
            char aft = s.charAt(endIndex);
            if (!((pre >= 'a' && pre <= 'z') || (pre >= '0' && pre <= '9'))) {
                startIndex++;
                continue;
            }
            if (!((aft >= 'a' && aft <= 'z') || (aft >= '0' && aft <= '9'))) {
                endIndex--;
                continue;
            }
            if (pre != aft) {
                return false;
            }
            startIndex++;
            endIndex--;
        }

        return true;
    }
}
