package oops.staticexample;

public class Main {
    public static void main(String[] args) {
        human rish=new human(19,"Rishit",1000,false);
        human ayush=new human(20,"Ayush",15000,true);
        System.out.println(rish.population);
        System.out.println(ayush.population);
        // those properties which are related to the objects
        // are static variables or method
        // for example- rish,ayush are humans, the total population 7 billion
        // is common to both of them right

    }
}
