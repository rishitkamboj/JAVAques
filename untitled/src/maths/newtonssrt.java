package maths;

public class newtonssrt {
    public static void main(String[] args) {
        System.out.printf("%.2f",sqrt(40));
    }
    static double sqrt(double n) {
        double x=n;
        double root;
        while(true) {
          root=0.5*(x+(n/x));
            if(Math.abs(root-x)<0.5) {
                break;
            }
            x=root;
        }
        return root;
    }
}
