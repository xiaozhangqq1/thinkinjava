package chapter5;

/**
 * 编写具有finalize()方法的类，并在方法中打印消息，在main()中为该类创建一个对象。试解释这个程序的行为
 */
public class FinalizeDemo {
    public static void main(String [] args){
        FinalizeDemo f = new FinalizeDemo();
        f.finalize();
    }
    protected void finalize(){
        System.out.println("finalize()方法运行了！");
    }
    //todo 修改前一个练习的程序，让你的finalize()总会被调用
}
