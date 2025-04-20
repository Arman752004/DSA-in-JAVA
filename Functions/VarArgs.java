package Functions;
import java.util.Arrays;;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,77,88,99);        //these are known as variable length arguments
        siri("Arman","Ishan","Sarthak","Silu","Bulu","Ayush","Anwesh");

        multiple(2,30,"kunal","Raj","taj");
    }
    static void fun(int ...v){          //the thing in the bracket will take as "array of integer"
        System.out.println(Arrays.toString(v));
    }
    static void siri(String ...x){
        System.out.println(x);
    }

    static void multiple(int a ,int b,String ...v){

    }
}
