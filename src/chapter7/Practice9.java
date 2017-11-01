package chapter7;

public class Practice9 {
    Component1 t1 = new Component1(1);
    Component2 t2 = new Component2(2);
    Component3 t3 = new Component3(3);
    public Practice9(int i){
        System.out.println("Practice9");
    }
    public void dispose(){
        System.out.println("Practice9 dispose");
        t3.dispose();
        t2.dispose();
        t1.dispose();
    }
    public static void main(String[] args){

        new Stem(1).dispose();
    }
}
class Component1{
    Component1(int i){
        System.out.println("Component1");
    }
    public void dispose(){
        System.out.println("Component1 dispose");
    }
}
class Component2{
    Component2(int i){
        System.out.println("Component2");
    }
    public void dispose(){
        System.out.println("Component2 dispose");
    }
}
class Component3{
    Component3(int i){
        System.out.println("Component3");
    }
    public void dispose(){
        System.out.println("Component3 dispose");
    }
}
class Stem extends Practice9{
    Component1 c = new Component1(4);
    Component2 c1 = new Component2(5);
    Component3 c2 = new Component3(6);
    public Stem(int i){
        super(i);
        System.out.println("Stem");
    }
    public void dispose(){
        System.out.println("Stem dispose");
        c2.dispose();
        c1.dispose();
        c.dispose();
        super.dispose();
    }
}