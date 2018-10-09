package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description TODO
 * @Date 2018/9/28 16:09
 **/
public class StrStr {

    @Test
    public void test() {
        Assert.assertEquals(0, strStr("a", "a"));
        Assert.assertEquals(-1, strStr("", "a"));
        Assert.assertEquals(0, strStr("a", ""));
        Assert.assertEquals(2, strStr("hello", "ll"));
        Assert.assertEquals(-1, strStr("aaaaa", "bba"));
    }


    public int strStr(String haystack, String needle) {

        if (needle.trim().isEmpty()) {
            return 0;
        }

        int x = haystack.length();
        int y = needle.length();

        if (x < y) {
            return -1;
        }

        for (int i = 0; i <= x - y; i++) {
            String str = haystack.substring(i, i + y);
            if (str.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
