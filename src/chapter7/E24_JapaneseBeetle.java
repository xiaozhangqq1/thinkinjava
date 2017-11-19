package chapter7;

public class E24_JapaneseBeetle {
    public static void main(String[] args) {
        new JapaneseBeetle();
    }
}
class JapaneseBeetle extends Beetle{
    int m = printInit("JanpaneseBeetle.m initialized");
    JapaneseBeetle(){
        System.out.println("m = "+m);
        System.out.println("j = "+j);
    }
    static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}
