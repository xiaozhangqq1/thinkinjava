package chapter5;

public class ConstructorDemo {
    public static void main(String [] args){
        //referenceDemo();
        new ConstructorDemo();
        new ConstructorDemo("接受的字符串");
    }
    public static void referenceDemo(){
        String s = null;
        System.out.println(s);
    }
    // 练习3：创建一个带默认构造器的类，在构造器中打印一条消息。为这个类创建一个对象
    ConstructorDemo(){
        System.out.println("这是默认构造器");
    }
    // 练习4：为前一个练习中的类添加一个重载构造器，令其接受一个字符串参数，并在构造器把你自己的消息和接收的参数一起打印出来
    ConstructorDemo(String s){
        System.out.println("s" + s);
    }
}
