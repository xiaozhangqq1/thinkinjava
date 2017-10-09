package chapter4;

/**
 * Created by zhangxuelong on 2017/10/9
 */
public class FibonacciExample {
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter++) {
            System.out.printf("Fibonacci of %d is: %d\n",
                    counter, fibonacci(counter));
        }
        for (int i = 5; i <= 5; i++){
            System.out.println("feibonacci2 i = "+ i +",value = "+fibonacci2(i));
        }
    }
    //非递归实现方式
    public static int fibonacci2(int number){
        int arr[] = new int[number + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= number; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[number];
    }
}
