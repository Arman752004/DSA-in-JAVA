package Oops.Polymorphism;

public class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 0.5 * h * b");
    }

    //Early Binding:check notes
    // final void area(){
    //     System.out.println("Area is 0.5 * h * b");
    // }
}
