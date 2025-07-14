package Oops.staticExample;

public class InnerClasses {     //outside classes cannot  be static
    static class Test{          //if we put inside thhe innerclasses then we need to use static and if we are putting it outside then there is no need
        String name;    
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
