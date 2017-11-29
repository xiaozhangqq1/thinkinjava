package chapter8;

import java.util.Random;

public class E08_RandomInstruments {
    public static void main(String[] args) {
        InstrumentGenerator gen = new InstrumentGenerator();
        for (int i = 0;i<20;i++){
            System.out.println(gen.next());
        }
    }
}
class InstrumentGenerator{
    Random gen = new Random(47);
    public Instrument next(){
        switch (gen.nextInt(6)){
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
        }
    }
}