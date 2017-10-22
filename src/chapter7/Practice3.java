package chapter7;

class Practice3 {
    Practice3() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Practice3 {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}