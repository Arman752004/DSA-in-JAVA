package Oops.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human arman = new Human(21,"Arman Panda");
        //Human twin = new Human(kunal);

        Human twin = (Human)arman.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(arman.arr));
    }
}
