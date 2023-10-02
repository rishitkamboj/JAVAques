package oops.staticexample;


public class innerclass {
    static class Test{
       String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Rishit");
        Test b=new Test("Rahul");


        System.out.println();




        System.out.println(a.name);
        System.out.println(b.name);

    }
}
