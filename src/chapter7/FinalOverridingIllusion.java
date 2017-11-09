package chapter7;

public class FinalOverridingIllusion {
}
class WithFinal{
    private final void f(){
        System.out.println("WithFinals.f()");
    }
    private void g(){
        System.out.println("WithFinals.g()");
    }
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
    }
}