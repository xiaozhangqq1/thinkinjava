package chapter7;

public class Practice5 {
    Practice5() {
        System.out.println("Practice5");
    }
    public static void main(String[] args){
        new Practice52();
    }
}
class Practice51{
    Practice51(){
        System.out.println("Practice51");
    }

}
class Practice52 extends Practice5{
    Practice51 p = new Practice51();

}
