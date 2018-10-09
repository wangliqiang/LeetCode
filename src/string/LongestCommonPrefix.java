package string;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 最长公共前缀
 * @Date 2018/9/29 16:16
 **/
public class LongestCommonPrefix {

    @Test
    public void test() {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(strs));

    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        String prefixStr = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefixStr) != 0) {
                prefixStr = prefixStr.substring(0, prefixStr.length() - 1);
                if (prefixStr.isEmpty()) return "";
            }
        }
        return prefixStr;
    }
}
