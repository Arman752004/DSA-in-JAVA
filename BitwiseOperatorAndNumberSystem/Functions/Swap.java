package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        //swap numbers code 
        // int temp = a;
        // a = b;
        // b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Arman Panda";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String naam){
        naam = "Kunal Kushwaha";
    }
    static void swap (int a ,int b){
        int temp = a;
        a = b;                  //as we are not changing a new object whereas creating a new one 
        b = temp;               //string can not be changed
    }
}
