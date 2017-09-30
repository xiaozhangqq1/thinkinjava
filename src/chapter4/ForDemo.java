package chapter4;

import java.util.Random;

/**
 * Created by zhangxuelong on 2017/9/30
 */
public class ForDemo {
    public static void main(String [] args){
        forDemo(100);
        //randomDemo();
        //randomWhile();
        //array();
    }
    private static void forDemo(int i){
        for (int n = 1; n <=i; n++){
            System.out.println(n);
            if (n == 99){
                //return;和break一样，起到终止程序的作用
                break;
            }
        }
    }

    /**
     * 写一个程序，产生25个int类型的随机数，对于每一个随机数，使用if-else语句来对其分类为大于，小于或等于紧随它而生成的的值。
     */
    public static void randomDemo(){
        int x,y;
        Random rand1 = new Random();
        Random rand2 = new Random();
        for(int i = 0; i < 25; i++) {
            x = rand1.nextInt(100);
            y = rand2.nextInt(100);
            if(x < y) System.out.println(x + " < " + y);
            else if(x > y) System.out.println(x + " > " + y);
            else System.out.println(x + " = " + y);
        }
    }

    /**
     * 修改练习2，把代码用while无限循环包括起来，然后运行直到键盘中断（ctrl-C）
     */
    public static void randomWhile(){
        int x,y;
        Random rand1 = new Random();
        Random rand2 = new Random();
        while (true){
            x = rand1.nextInt(100);
            y = rand2.nextInt(100);
            if (x < y){
                System.out.println(x + "<" + y);
            }else if (x > y){
                System.out.println(x + ">" + y);
            }else {
                System.out.println(x + "=" + y);
            }
        }
    }
    /**
     * 写一个程序，使用两个嵌套for和取余操作来探测和打印素数
     */
    public static void array(){
        String str = "a,b,c,,";
        String [] arr = str.split(",");
        for(String s : arr){
            System.out.println(s);
        }
        System.out.println(arr.length);
    }
}
