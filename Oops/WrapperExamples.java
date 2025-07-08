package Oops;

public class WrapperExamples {
    public static void main(String[] args) {
        // int a = 10;              //we cant swap directly by using swap 
        // int b = 20;

        // Integer num = 45;       //it is a wrapper class because of int and it will have so many properties


        Integer a = 10;             //Still we cant swap using this type...
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

        //final int bonus = 2;            //we cant change final keyword
        //bonus = 3;                      //we will get error

        final A kunal = new A("Kunal kushwaha");
        kunal.name = "other name";

        //when  a non primitive is final, you cannot reassign it
        //kunal = new A("new object");

        // A obj;          //For garbage collection 

        // for (int i = 0; i < 1000000; i++) {
        //     obj = new A("Random name");     //the previous one will be removed and new one will be created
        // }

    }

    static void swap(Integer a ,Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}
