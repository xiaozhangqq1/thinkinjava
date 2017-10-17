package chapter6;

import java.util.Vector;
import chapter6.debug.DebugDemo;

public class ClassDemo {
    // 在某个包中创建一个类，在这个类所处的包的外部创建该类的一个实例。
    // 在chapter5文件夹创建了类Demo

    // 将本节中的代码片段改写为完整的程序，并校验实际所发生的冲突。
    public static void main(String[] args) {
        new Vector();
        System.out.println("Exercise");
        DebugDemo.debug("dfdfa");
        demo();
        ClassDemo classDemo = new ClassDemo();
        classDemo.a = 1;
        classDemo.b = 2;
        classDemo.c = 3;
        classDemo.d = 4;
        classDemo.defaultDemo();
        classDemo.privateDemo();
        classDemo.protectedDemo();
        classDemo.publicDemo();
        new Widget();
    }
    //展示protected方法具有包访问权限，但不是public
    protected static void demo(){
        System.out.println("展示protected权限");
    }
    //创建一个带有public,private,protected和包访问权限域以及方法成员的类。创建该类的一个对象，看看在你试图调用所有类成员时，会得到什
    // 么类型的编译信息。请注意，处于同一个目录中的所有类都是默认包的一部分。
    public int a;
    private int b;
    protected int c;
    int d;
    public void publicDemo(){
        System.out.println("publicDemo");
    }
    private void privateDemo(){
        System.out.println("privateDemo");
    }
    protected void protectedDemo(){
        System.out.println("protectedDemo");
    }
    void defaultDemo(){
        System.out.println("defaultDemo");
    }
    //创建一个带有protected数据的类。运用在第一个类中处理protected数据的方法在相同的文件中创建第二个类

}
