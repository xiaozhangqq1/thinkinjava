package chapter4;

public class SwitchDemo {


    public static void main(String[] args) {
        switchDemo();
    }

    private static void switchDemo() {
        int i;
        for (i = 1; i < 5; i++) {
            switch (i) {
                case 1:
                    System.out.println(1);
                    //break;
                case 2:
                    System.out.println(2);
                    //break;
                case 3:
                    System.out.println(3);
                    //break;
                case 4:
                    System.out.println(4);
                    //break;
            }

        }

    }
}
