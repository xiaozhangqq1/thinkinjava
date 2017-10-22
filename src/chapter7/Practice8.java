package chapter7;

public class Practice8 extends Practice81 {
    Practice8(int i) {
        super(1);
    }
    Practice8(){
        super(1);
    }

    public static void main(String[] args) {
        Practice81 p = new Practice81(1);
        new Practice8();
        new Practice8(1);
    }
}

class Practice81 {
    Practice81(int i) {
        System.out.println("81");
    }
}