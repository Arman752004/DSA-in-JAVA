package Oops.staticExample;

public class Main {
    public static void main(String[] args) {
        // Human arman = new Human(22, "Arman Panda",22000, false);
        // Human kunal = new Human(34, "Kunal Kushwaha",34000, true);
        // Human arpit = new Human(26, "Arpit Saha",20000, true);

        // System.out.println(Human.population);
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        //greeting();                     //to get the access of greeting we have to use static method

        Main funn = new Main();
        funn.fun2();    
    }


    static void fun(){
        //greeting();                 //we can't use this because this require an instance or we need to make greeting  static
        //but the function you are using it in does not require instances


        //you cannot access non static stuff without referencing their instances in a static context
        
        //hence, here I am referencing it
        Main obj = new Main();          //by using this  we can access non-static method
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
    //we know  smotheing which is non static belongs to object
    void greeting(){             //inside a static method we can't use anything which is not static
        fun();                   //we can import a static method inside a non static method
        System.out.println("Hello World");
    }
}
