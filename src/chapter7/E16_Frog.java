package chapter7;

class Amphibian {
    void print() {
        System.out.println("print");
    }

    void printf() {
        System.out.println("printf");
    }
}

class Frog extends Amphibian {

    //practice17 子类同名方法会覆盖父类方法
    void print(){
        System.out.println("子类特有print");
    }
    void printf(){
        System.out.println("子类特有printf");
    }
}

public class E16_Frog {
    public static void main(String[] args) {
        //向上转型，可用父类的方法
        Amphibian a = new Frog();
        a.print();
        a.printf();
    }

}
