package Oops.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(23);
        daughter.career();

        Parent.hello();
        // Parent mom = new Parent(22){

        //     @Override
        //     void career() {

        //     }

        //     @Override
        //     void partner() {

        //     }
        // };

    }   
}
