package chapter4;

public class Fibnacci {
    public static void main(String [] args){
        fibonacci(4);
    }
    public static void fibonacci(int i){
        if (i == 1){
            System.out.println(1);
        }
        if (i ==2){
            System.out.println(1);
            System.out.println(1);
        }
        for(int n = 1;n < i; n++){
            System.out.println(n);
        }

//todo 吸血鬼数字
    }
}
