package Oops.Inheritance;

public class BoxWeight extends Box {        //it will import data from box
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    static void greeting(){
        System.out.println("Hey I am Box class.Greetings!");
    }

    BoxWeight (BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side,double weight){
        super();
        this.weight = weight;
    }

    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);   //call the parent class constructor
        //use to initialise values present in parent class

        //System.out.println(super.weight);

        this.weight = weight;
    }
}
