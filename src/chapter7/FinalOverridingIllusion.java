package chapter7;

public class FinalOverridingIllusion {
    public static void main(String[] args){
        OverridingPravite2 op2 = new OverridingPravite2();
        op2.f();
        op2.g();
        OverridingPravite op = op2;
        WithFinal wf = op2;
    }
}
class WithFinal{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }}
    class OverridingPravite extends WithFinal{
        private final void f(){
            System.out.println("OverridingPrivate.f()");
        }
        private void g(){
            System.out.println("OverridingPrivate.g()");
        }
    }
    class OverridingPravite2 extends OverridingPravite{
        public final void f(){
            System.out.println("OverridingPrivate2.f() ");
        }
        public void g(){
            System.out.println("OverridingPrivate2.f()");
        }
    }
