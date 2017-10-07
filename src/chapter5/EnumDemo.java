package chapter5;

public class EnumDemo {
    Coin coin;
    public EnumDemo(Coin coin){
        this.coin = coin;
    }
    public void describe(){
        switch (coin){
            case LI:
                System.out.println("这是厘");
                break;
            case FEN:
                System.out.println("这是分");
                break;
            case JIAO:
                System.out.println("这是角");
                break;
            default:
                System.out.println("这是元");
        }
    }
    public static void main(String[] args){
        for (Coin c : Coin.values()) {
            System.out.println(c + ", ordinal " + c.ordinal());
        }
        EnumDemo e = new EnumDemo(Coin.LI),
                m = new EnumDemo(Coin.FEN),
                o = new EnumDemo(Coin.JIAO);
        e.describe();
        m.describe();
        o.describe();
    }
    // 创建一个enum，它包含纸币中最小面值的6种类型。通过values()循环并打印每一个值及其ordinal()
    public enum Coin{
        LI, FEN, JIAO, YUAN
    }
    // 在前面的例子中，为enum写一个switch语句，对于每一个case，输出该特定货币的描述
}
