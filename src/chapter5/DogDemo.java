package chapter5;

public class DogDemo {
    public static void main(String [] args){
        //new DogDemo("barking");
        //new DogDemo(1);
        new DogDemo("howing",2);
        new DogDemo(1,"barking");
    }
    // 练习5：创建一个名为Dog的类，它具有重载的bark()方法。此方法应根据不同的基本数据类型进行重载，并根据被调用的版本，打印出
    // 不同类型的狗吠(barking),咆哮(howling)等信息。编写main()来调用所有不同版本的方法
    private DogDemo(String s){
        System.out.println("dog" + s);
    }
    private DogDemo(Integer s){
        System.out.println("dog" + s);
    }
    /**
     * 修改前一个练习的程序，让两个重载方法各自接收两个类型的不同的参数，但二者顺序相反。验证其是否工作
     */
    DogDemo(String s,Integer i){
        System.out.println("dog"+ s +", int" + i);
    }
    DogDemo(Integer i,String s){
        System.out.println("int" + i +", dog" + s);
    }
    // 创建一个没有构造器的类，并在main()中创建其对象，用以验证编译器是否真的自动加入了默认构造器
}
