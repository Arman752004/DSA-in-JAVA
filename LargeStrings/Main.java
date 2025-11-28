package LargeStrings;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor 2
        //StringBuffer sb2= new StringBuffer("Arman Panda");

        //constructor 3
        //StringBuffer sb3= new StringBuffer(30);

        sb.capacity();
        sb.append("WeMakeDevs");        //Adding stuff

        //sb.insert(2, "Rahul");      //Adding rahul in index 2

        sb.replace(1, 5, "Kuswaha");            //replace with kushwaha

        sb.delete(1, 2);            //delete it

        sb.reverse();                         //reverse the whole string

        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        //removing Whitespaces
        String sentence = "Hi h  hjh knfdoafn jfpafjiwa";
        System.out.println(sentence);
        System.out.println(sentence.replaceAll("\\s", ""));

        //split
        String arr = "Kunal apporv rahul arman";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        //rounding off 
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println(df.format(7.29));
    }
}
