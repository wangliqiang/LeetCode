package string;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Author wangliqiang
 * @Description 字符串中的第一个唯一字符
 * @Date 2018/9/27 15:09
 **/
public class FirstUniqChar {

    @Test
    public void test() {
        System.out.println("暴力搜索：" + firstUniqChar("loveleetcode"));
        System.out.println("HashMap：" + firstUniqChar_Hashmap("loveleetcode"));
    }

    /**
     * 暴力搜索
     *
     * @param str
     * @return
     */
    private static int firstUniqChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isUniqChar = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUniqChar = false;
                    break;
                }
            }
            if (isUniqChar)
                return i;
        }
        return -1;
    }

    /**
     * 第一次遍历每一个字符，统计每种字符出现的次数。第二次遍历，找到第一出现的字符次数为1的字符。
     *
     * @param str
     * @return
     */
    private static int firstUniqChar_Hashmap(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (!hashMap.containsKey(str.charAt(i))) {
                hashMap.put(str.charAt(i), 1);
            } else {
                hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
