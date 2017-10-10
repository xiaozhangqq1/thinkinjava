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
    }

}
