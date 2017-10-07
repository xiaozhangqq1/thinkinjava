package chapter5;

public class ArrayDemo {
    // 创建一个String对象数据，并为每一个元素都赋值一个String.用for循环来打印该数组
    /*public static void main(String[] args) {
        printArr();
        f("aa","bb","cc");
    }*/

    private static void printArr() {
        String[] arr = {"a", "b", "c"};
        for(String s : arr){
            System.out.println(s);
        }
    }
    // 写一个类，它接受一个可变参数的String数组。验证你可以向该方法传递一个用逗号分隔的String列表，或是一个String[].
    static void f(String...strings){
        for (String s : strings){
            System.out.println(s);
        }
    }
    // todo 创建一个使用可变参数列表而不是普通的main()语法的main().打印所产生的args数组的所有元素，并用各种不同数量的命令行
    // 参数来测试它。
    public static void main(String...args){
        for (String s : args){
            System.out.println(s);
        }
    }
}
