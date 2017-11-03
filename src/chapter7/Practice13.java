package chapter7;

public class Practice13 {
    public static void main(String [] args){
        MoreOverLoads m = new MoreOverLoads();
        m.f(1);
        m.f('c');
        m.f(1.1);
        m.f("hello");
    }
}
class ThreeOverLoads{
    public void f(int i ){
        System.out.println("f(int i)");
    }
    public void f(char c){
        System.out.println("f(char c");
    }
    public void f(double d){
        System.out.println("f(double d)");
    }
}
class MoreOverLoads extends ThreeOverLoads{
    public void f(String s){
        System.out.println("f(String s)");
    }
}

