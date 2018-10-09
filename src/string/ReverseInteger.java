package string;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 翻转整数
 * @Date 2018/9/27 13:52
 **/
public class ReverseInteger {

    @Test
    public void test() {
        int x = 123;
        System.out.println(x);
        System.out.println("---------");
        System.out.println(reverseInteger(1534236469));
    }

    public static int reverseInteger(int x) {
        int temp = x;
        long result = 0;

        while (temp != 0) {
            result = result * 10 + temp % 10;
            temp = temp / 10;
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            result = 0;
        }
        return (int) result;
    }
}
