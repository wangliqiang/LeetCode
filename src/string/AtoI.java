package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 字符串转整数 (atoi)
 * @Date 2018/9/28 10:26
 **/
public class AtoI {

    @Test
    public void test() {
        Assert.assertEquals(0, myAtoi(" "));
        Assert.assertEquals(2147483647, myAtoi("2147483648"));
        Assert.assertEquals(-42, myAtoi("   -42"));
        Assert.assertEquals(4193, myAtoi("4193 with words"));
        Assert.assertEquals(0, myAtoi("words and 987"));
        Assert.assertEquals(-2147483648, myAtoi("-91283472332"));
    }


    public int myAtoi(String str) {

        // 合法性判断
        if (str.trim().isEmpty()) return 0;
        // 正负号标记
        int sign = 1;

        // 转换值
        int base = 0;

        // 索引位数
        int i = 0;

        // 剔除开始空白字符
        while (str.charAt(i) == ' ')
            i++;

        // 判断正负号
        if (str.charAt(i) == '-' || str.charAt(i) == '+')
            sign = str.charAt(i++) == '-' ? -1 : 1;

        // 索引有效数字字符
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {

            // 如果`base > MAX_VALUE/10`，那么`base*10 + new_value` > `base*10` > `MAX_VALUE`。这个应该很容易理解，这种情况下就会发生溢出。
            // 若`base == INT_MAX/10`，而且`new_value = s+tr.charAt(i+) - '0'`大于`7`，也会发生溢出。因为`MAX_VALUE = 2147483647`
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // 计算转换值
            base = 10 * base + (str.charAt(i++) - '0');
        }

        // 计算结果值
        return base * sign;
    }
}
