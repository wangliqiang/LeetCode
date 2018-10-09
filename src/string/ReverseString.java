package string;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 翻转字符串
 * @Date 2018/9/27 13:34
 **/
public class ReverseString {

    @Test
    public void test() {

        System.out.println("");

        String str = "Hello World!";

        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.println("Hello World!");

        System.out.println("--------------");

        System.out.println(stringBuilder.reverse().toString());
    }
}
