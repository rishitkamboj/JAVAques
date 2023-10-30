package OOPS.staticExample;

// demo to show initialisation of static variables

public class Staticblock {
    static int a=4;
    static int b;

    static {
        System.out.println("I am in static block");
        b=a*5;
    }// will only run once when the first object is created i.e when the class is
    // loaded for the first time

    public static void main(String[] args) {
        Staticblock obj=new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);
        Staticblock.b +=3;

        Staticblock obj2=new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);
    }
}
