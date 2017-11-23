package chapter8;

/**
 * Created by zhangxuelong on 2017/11/23
 */
public class E06_MusicToString {
    static Instrument[] orchestra = {new Wind()};
    public static void printAll(Instrument[] orch){
        for(Instrument i:orch){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printAll(orchestra);
    }
}

