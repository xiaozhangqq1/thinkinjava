package chapter8;

public class Wind extends Instrument {
    public void play(Note n){
        System.out.println("Wind.play()" + n);
    }
    public String toString(){return "wind";}
}
