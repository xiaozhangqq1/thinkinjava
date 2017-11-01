package chapter7;

public class Practice6 {

}

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}
class Chess extends BoardGame{

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
    public static void main(String[] args){
        Chess c = new Chess();
    }
}
