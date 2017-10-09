package chapter4;

import java.util.HashMap;
import java.util.Map;

public class Fibnacci {
    public static void main(String [] args){
        System.out.println(recurision(2));
    }
    /*public static void fibonacci(int i){
        if (i == 1){
            System.out.println(1);
        }
        if (i ==2){
            System.out.println(1);
            System.out.println(1);
        }
        for(int n = 1;n < i; n++){
            System.out.println(n);
        }*/
    private static Map<Integer,Integer> map = new HashMap<>();

    private static Integer recurision(Integer i){
        if (i == 0){
            printResult(i,0);
            return 0;
        }
        if (i == 1){
            printResult(i,1);
            return 1;
        }
        if (map.containsKey(i)){
            return map.get(i);
        }
        Integer result = recurision(i-1) + recurision(i -2);
        printResult(i,result);
        map.put(i,result);
        return result;
    }

    private static void printResult(Integer i, Integer result) {
        System.out.println(i + " -> " + result);
    }
    private static long fibonacci(long number){
        if (number == 0 || number == 1){
            return number;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }

    }
}
//todo 吸血鬼数字
