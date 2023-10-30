package OOPS.lecture3;

public class Boxweight extends Box{
    double weight;

   Boxweight() {
        this.weight = -1;
    }

    public Boxweight(double length, double height, double width, double weight) {
        super(length, height, width); //what is this super?
        // it is used to initialise the values present in parent class !!!
        this.weight = weight;
    }
}
