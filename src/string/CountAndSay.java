package string;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 报数
 * @Date 2018/10/8 8:57
 **/
public class CountAndSay {

    @Test
    public void test() {

        System.out.println(countAndSay(5));
    }

    public String countAndSay(int n) {

        if (n == 1) {
            return "1";
        } else {
            String output = countAndSay(n - 1), result = "";
            int index = 0;
            while (index < output.length()) {
                char current = output.charAt(index);
                int cursor = index, count = 0;
                while (cursor < output.length() && output.charAt(cursor) == current) {
                    cursor++;
                    count++;
                }
                char number = (char) (count + '0');
                result += number;
                result += current;
                index += count;
            }
            return result;
        }
    }
}
