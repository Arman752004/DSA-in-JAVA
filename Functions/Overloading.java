package Functions;
import java.util.Arrays;
public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("raj");
        int ans =sum(3,4);
        System.out.println(ans);
        demo(2,3,4,5);  //if we dont write anything then it will give error
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b,int c){
        return a + b + c;
    }
    static void fun(int a ){
        System.out.println("first one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
}
