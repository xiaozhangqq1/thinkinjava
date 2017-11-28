package chapter8;

/**
 * Created by zhangxuelong on 2017/11/27
 */
public class E09_Rodents {

}

class Rodent{
    public void hop(){
        System.out.println("Rodent hopping");
    }
    public void scurry(){
        System.out.println("Rodent scurrying");
    }
    public void reproduce(){
        System.out.println("Making more Rodents");
    }
    public String toString(){
        return "Rodent";
    }
}

class Mouse extends Rodent{
    public void hop(){
        System.out.println("Mouse hopping");
    }
}