package chapter5;

public class ThisDemo1 {
    public static void main(String [] args){
        //ThisDemo1 t = new ThisDemo1(1,"a");
        ThisDemo1 t1 = new ThisDemo1("S");
    }

    /**
     * 编写具有两个（重载）构造器的类，并在第一个构造器中通过this调用第二个构造器
     * @param i
     */
    ThisDemo1(Integer i,String s){
        this(s);
        System.out.println("Integer");

    }
    ThisDemo1(String s){
        System.out.println("String");
    }
}
