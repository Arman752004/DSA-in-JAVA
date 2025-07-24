package Oops.Generics;

// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//here
public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;       //also working as index value
    
    public WildcardExample(){
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //do something


    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        //copy current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;    
    }
    
    private boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        //ArrayList list = new ArrayList<>();
        // CustomArrayList list = new CustomArrayList();
        // list.add(3);
        // list.add(5);
        // list.add(9);

        // for (int i = 0; i < 14; i++) {
        //     list.add(2 * i);
        // }

        // System.out.println(list);

        // ArrayList<String> list2 = new ArrayList<>();
        // list2.add("Arman");

        WildcardExample<Integer> list3 = new WildcardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
