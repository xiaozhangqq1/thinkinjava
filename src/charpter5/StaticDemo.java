package charpter5;

class Cup{
    Cup(int marker){
        System.out.println("Cup("+ marker +")");
    }
    void f(int marker){
        System.out.println("f(" + marker + ")");
    }
}
class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}
public class StaticDemo{
    public static void main(String[] args){
        // System.out.println("Inside main()");
        // Cups.cup2.f(99);
        Static1.f();
    }
    // static Cups cups1 = new Cups();
    // static Cups cups2 = new Cups();
}
// todo
// 编写一个类，拥有两个静态字符串域，其中一个在定义处初始化，另一个在静态块中初始化。现在加入一个静态方法用以打印出两个
// 字段值。请证明它们都会在被使用之前完成初始化动作。

class Static1{
    private static String s1 = "S1";

    static {
        String s2 ="S2";
    }
    static void f(){
        System.out.println(s1);

    }
}