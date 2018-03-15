package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/15
 */
public class Practice119 {
    static String intToBinary(Integer N) {
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        return s;
    }

    public static void main(String[] args) {
        System.out.println(intToBinary(8));
    }
}
