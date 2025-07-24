package Oops.Access;

public class Subclass extends A{
    public Subclass(int num,String name){
        super(num,name);
    }
    public static void main(String[] args) {
        // Subclass obj = new Subclass(45, "Arman panda");
        // int n = obj.num;
        // System.out.println(obj instanceof Subclass);
    }
}

// class SubSubclass extends Subclass{
//     public SubSubclass (int num,String name){
//         super(num, name);
//     }
// }

// class Subclass2 extends A {
//     public Subclass2(int num,String name){super(num,name);};
//     public static void main(String[] args) {
//         // Subclass2 obj = new A(45,"Arman Panda");
//         // int n = obj.num;
//     }
// } 