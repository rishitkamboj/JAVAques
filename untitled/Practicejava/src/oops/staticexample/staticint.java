package oops.staticexample;



// this is a demo to show initilisation of static variables
public class staticint {
    static int a=4;
    static int b;


    // this will only work once i.e. when the class is loaded for the first time
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        staticint obj=new staticint();
        System.out.println(staticint.a+" "+staticint.b);
        staticint.b+=3;
        System.out.println(staticint.a+" "+staticint.b);

      // now static block didnt run

        staticint obj2=new staticint();
        System.out.println(staticint.a+" "+staticint.b);
    }

}
