package chapter7;

public class FinalArguments {
    void with(final Gizmo g){

    }
    void without(Gizmo g){
        g = new Gizmo();
        g.spin();
    }
    int g(final int i){return i+2;}
    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.with(null);
        bf.without(null);
    }
}
class Gizmo{
    public void spin(){}
}