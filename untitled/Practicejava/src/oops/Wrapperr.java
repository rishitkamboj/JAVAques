package oops;

public class Wrapperr {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;

        swap(a,b);
        System.out.println(a+" "+b);
        // integer is a final class
//        final int bonus=2;
      final A kunal=new A("Kunal");
      kunal.name="Other name";
      // but cant do kunal=new A("heello");
        // When a non primitive is final, you cannot reassign it

    }
   static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object is destroyed");

    }
}

/* Final is a keyword that is used to prevent your object
from being modified
 */
/* It is to make the final variable name CAPITAL
   Always initialize while declaring */
/* Final is only true for primitive */