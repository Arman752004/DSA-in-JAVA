package Arrays;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer> ();
        // list.add(67);
        // list.add(6778);
        // list.add(6742);
        // list.add(989);
        // list.add(343);
        // list.add(534);

        // System.out.println(list.contains(67));
        // list.set(0, 22);
        // list.remove(2);

        // System.out.println(list);

        //input
        for (int i = 0;i < 5;i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0;i < 5;i++){
            System.out.println(list.get(i));    //pass index here,list[index] syntx will not work here
        }
        System.out.println(list);
        in.close();
    }
}
