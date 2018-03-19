package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/17
 */
public class Practice1113 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }
}
