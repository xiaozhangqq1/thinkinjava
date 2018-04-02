package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/17
 */
public class CounterTest {

    public static void main(String[] args) {

        Counters c1 = new Counters("ones");
        c1.increment();
        Counters c2 = c1;
        c2.increment();
        System.out.println(c1);
    }

}

class Counter {
    String id;
    int count;

    void increment() {
        id = id + 1;
        System.out.println(id);
    }

    int tally() {
        return count;
    }

    Counter(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}

class Counters {
    private final String name;
    private int count;

    Counters(String name) {
        this.name = name;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    public String toString() {
        return count + "" + name;
    }
}
