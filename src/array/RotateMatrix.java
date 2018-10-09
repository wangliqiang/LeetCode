package array;

import org.junit.Test;

/**
 * @Author wangliqiang
 * @Description 旋转图像
 * @Date 2018/9/27 10:44
 **/
public class RotateMatrix {

    @Test
    public void test() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("before:");
        System.out.println("[\n  [1,2,3]\n  [4,5,6]\n  [7,8,9]\n]");

        System.out.println("-------------");
        System.out.println("after:");
        int[][] out = ratate(matrix);
        System.out.println("[");
        for (int i = 0; i < out.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < out[i].length; j++) {
                System.out.print(j < out[i].length - 1 ? out[i][j] + "," : out[i][j]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static int[][] ratate(int[][] matrix) {
        int length = matrix.length;

        // 调换对角元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][length - i - 1];
                matrix[length - j - 1][length - i - 1] = tmp;
            }
        }

        // 调换列元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = tmp;
            }
        }
        return matrix;
    }
}
