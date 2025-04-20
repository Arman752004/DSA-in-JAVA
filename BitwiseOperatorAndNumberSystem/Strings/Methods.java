package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Arman Panda";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());  //it will trim the extra space
        System.out.println(Arrays.toString(name.split(" ")));  //it will divide the two words
    }
}
