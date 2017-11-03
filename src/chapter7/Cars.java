package chapter7;


public class Cars {
    public Engines engines = new Engines();
    public Wheel[] wheels = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door();

    public Cars(){
        for(int i = 0;i < 4; i++){
            wheels[i] = new Wheel();
        }
    }
    public static void main(String [] args){
        Cars car = new Cars();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
    }


}

class Engines{
    public void start(){}
    public void rev(){}
    public void stop(){}
}
class Wheel{
    public void inflate(int psi){}
}
class Window{
    public void rollup(){}
    public void rolldown(){}
}
class Door{
    public Window window = new Window();
    public void open(){}
    public void close(){}
}