package chapter7;

public class Practice7 {
    Practice7(int i) {
        System.out.println("Practice5");
    }
    public static void main(String[] args){
        new Practice52();
    }
}
class Practice71{
    Practice71(int i){
        System.out.println("Practice51");
    }

}
class Practice72 extends Practice7{
    Practice71 p = new Practice71(1);

    Practice72(int i) {
        super(i);
    }
}
