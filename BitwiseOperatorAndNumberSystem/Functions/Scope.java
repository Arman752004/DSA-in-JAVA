package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        //int b = 20;
        String name = "Kunal";
        {
            //int a = 78; //already intialised outside the block in the same method hence u cannot initialised again
            //but we can change the value
            a =100;         //reassign the original ref value to some other value
            System.out.println(a); 
            //int c = 99;
            name = "Arman";
            //values initialised in this block,will remain in block
        }
        //int c = 990;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);    //cannot used outside the block

        //scoping in for loop
        for(int i = 0;i <=5 ;i++){
            System.out.println(i); //we cant print i outside the loop
        }
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
