package Functions;

public class Shadowing {
    static int x= 10;  //this will ve shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);      //scope will begin when the vaue is initialised
        int x = 90;     //the class variable of line 4 is shadowed by this
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
