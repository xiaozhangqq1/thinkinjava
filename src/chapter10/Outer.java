package chapter10;

/**
 * Created by zhangxuelong on 2018/2/3
 */
public class Outer {
    static int to(){
        return 11;
    }
    static class Inner{
        int i = to();
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.i);
    }
}

/**
 * 官方示例
 */
class Outer1{
    class Inner1{

    }
    Inner1 getInner1(){
        return new Inner1();
    }
}

class E01_ReferenceToInnerClass{

}
