package charpter5;

public class ThisDemo {
    public static void main(String[] args){
        ThisDemo t = new ThisDemo();
        t.function1();
    }
    // 编写具有两个方法的类，在第一个方法内调用第二个方法两次：第一次调用时不使用this关键字，第二次调用时使用this关键字
    // 这里只是验证它是起作用的，你不应该在该实践中使用这种方式

    private void function1(){
        function2();
        this.function2();
    }
    private void function2(){
        System.out.println("测试this调用");
    }
}
