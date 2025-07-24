package Oops.AbstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age){
        this.age = age;
        VALUE = 3244567;
    }

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();
}
