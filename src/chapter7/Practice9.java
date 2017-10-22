package chapter7;

public class Practice9 {
    public Practice9(){
        System.out.println("Practice9");
    }
    public static void main(String[] args){
        new Component1();
        new Component2();
        new Component3();
        new Stem();
    }
}
class Component1{
    Component1(){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
}
class Stem extends Practice9{
    Component1 c = new Component1();
    Component2 c1 = new Component2();
    Component3 c2 = new Component3();
    Stem(){
        System.out.println("Stem");
    }
}