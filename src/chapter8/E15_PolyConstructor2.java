package chapter8;


public class E15_PolyConstructor2 {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectangularGlyph(2, 2);
    }
}

class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;

    RectangularGlyph(int width, int height) {
        this.height = height;
        this.width = width;
        System.out.println("RectangularGlyph.RectangularGlyph(),width = " + width + ",height=" + height);}

    void draw() {
        System.out.println("RectangularGlyph.draw(),area=" + width * height);
    }
}

class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph()before draw");
        draw();
        System.out.println("Glyph()after draw");
    }
}

class RoundGlyph extends Glyph{
    private int radius = 1;
    RoundGlyph(int r){
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(),radius="+radius);
    }
    void draw(){
        System.out.println("RoundGlyph.draw(),radius="+radius);
    }
}