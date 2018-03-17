package Algorithns;

/**
 * Created by zhangxuelong on 2018/3/17
 */
public class CounterTest {

    public static void main(String[] args) {

        Counter c1 = new Counter("ones");
        c1.increment();
        Counter c2 = c1;
        c2.increment();
        System.out.println(c1);
    }

}

class Counter {
    String id;
    int count;

    void increment() {
        id = id + 1;
        count = count + 1;
    }

    int tally() {
        return count;
    }

    Counter(String id) {

    }

    @Override
    public String toString() {
        return "Counter{" +
                "id='" + id + '\'' +
                ", count=" + count +
                '}';
    }
}
