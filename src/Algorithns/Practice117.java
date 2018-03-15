package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/14
 */
public class Practice117 {
    static double t = 9.0;

    public static void testa() {
        while (Math.abs(t - 9.0 / t) > .001)
            t = (9.0 / t + t) / 2.0;
        System.out.printf("%.5f\n", t);
    }

    static int sum = 0;

    public static void testb() {
        for (int i = 1; i < 1000; i++)
            for (int j = 0; j < i; j++)
                sum++;
        System.out.println(sum);
    }

    static int sum1 = 0;
    public static void testc(){
        for (int i = 1;i<1000;i*=2)
            for (int j = 0;j<1000;j++)
                sum1++;
        System.out.println(sum1);
    }


    public static void main(String[] args) {
        testa();        // 3.00009
        testb();        // 499500
        testc();        // 10000
    }
}
