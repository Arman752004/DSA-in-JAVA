package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {
        //box1.getL();
    //     Box box = new Box(4);
        // Box box1 = new Box(4.6,7.9,9.9);
        // Box box2 = new Box(box1);
        // System.out.println(box1.w + " " + box2.h);


    //     System.out.println(box.l + " " + box.w + " " + box.h);
    //     System.out.println(box1.l + " " + box1.w + " " + box1.h);
    //     System.out.println(box2.l + " " + box2.w + " " + box2.h);

        // BoxWeight box3 = new BoxWeight();
        // BoxWeight box4 = new BoxWeight(2,3,4,8);
        // System.out.println(box3.h + " " + box3.weight);

        // Box box5 = new BoxWeight(2,3,4,8);
        // System.out.println(box5.w);

        //there are manny variable in both child and parent classes
        //you are given access to variable that are in the ref type i.e. BoxWeight hence,
        //you should have access to weight variable
        //this also means, that the ones that are trying to access should be initialised
        //but here,when the obj is of type parent class, how will you call the constructor of child class
        //this is why error
        // BoxWeight box6 = new Box(2,3,4);
        // System.out.println(box6);


        // BoxPrice box = new BoxPrice(5,8,200);
        // System.out.println(box);


        //box.greeting();

        // Box box = new BoxWeight();
        // box.greeting();         //you can inherit but you cant override
    }
}
