package chapter7;

 public class Detergent {
    private Cleanser cleanser = new Cleanser();
    public void append(String a){
        cleanser.append(a);
    }
    public void dilute(){
        cleanser.dilute();
    }
    public void apply(){
        cleanser.apply();
    }
    public String toString(){
        return cleanser.toString();
    }
    public void scrub(){
        append("DetergentDelegation.scrub()");
        cleanser.scrub();
    }
    public void foam(){
        append("foam()");
    }
    public static void main(String[] args){
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        x.main();
    }

     private void main() {
     }

     private static class Cleanser {
         public void append(String a) {
         }

         public void dilute() {
         }

         public void apply() {
         }
         public void scrub(){
             
         }
     }
 }
class E11_Delegation{
    public static void main(String[] args){
        Detergent.main(args);
    }
}
