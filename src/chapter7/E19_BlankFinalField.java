package chapter7;

public class E19_BlankFinalField {
    public static void main(String[] args) {
        WithBlankFinalField wbff = new WithBlankFinalField(10);
        System.out.println(wbff.getI());
    }
}

class WithBlankFinalField {
    private final Integer i;

    public WithBlankFinalField(int ii) {
        i = new Integer(ii);
    }

    public Integer getI() {
        return i;
    }
}