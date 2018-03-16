package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/16
 */
public class Practice1112 {
    static int[] a = new int[10];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int j =0;j<a.length;j++){
            System.out.println(a[j]);
        }

        for (int k = 0;k<10;k++){
            a[k] = a[a[k]];
        }
    }
}
