package charpter5;

public class ArrayDemo {
    // 创建一个String对象数据，并为每一个元素都赋值一个String.用for循环来打印该数组
    public static void main(String[] args) {
        printArr();
    }

    private static void printArr() {
        String[] arr = {"a", "b", "c"};
        for(String s : arr){
            System.out.println(s);
        }
    }

}
