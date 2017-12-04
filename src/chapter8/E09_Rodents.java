package chapter8;

/**
 * Created by zhangxuelong on 2017/11/27
 */
public class E09_Rodents {
    public static void main(String[] args) {
        Rodent rodent = new Mouse();
        rodent.hop();
        rodent.reproduce();
        rodent.reproduce();
        System.out.println(rodent);
    }

}

class Rodent {
    public void hop() {
        System.out.println("Rodent hopping");
    }

    public void scurry() {
        System.out.println("Rodent scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Rodents");
    }

    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    public void hop() {
        System.out.println("Mouse hopping");
    }

    public void scurry() {
        System.out.println("mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mice");
    }

    public String toString() {
        return "Mouse";
    }
}