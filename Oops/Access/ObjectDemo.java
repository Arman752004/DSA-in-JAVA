package Oops.Access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num,float gpa){
        this.num = num;
        this.gpa = gpa; 
    }

    //already covered these two
    @Override
    public String toString() {
        return super.toString();
    }

    //@Override
    // protected void finalize() throws Throwable {
    //     super.finalize();
    // }

    // public ObjectDemo(int num){
    //     this.num = num;
    // }

    //hashcode
    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34,7.8f);
        ObjectDemo obj2 = new ObjectDemo(45,9.2f);

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        // System.out.println(obj.hashCode());
        // System.out.println(obj2.hashCode());

        System.out.println(obj1.getClass().getName());            //we will get the class of the obj and name of the file
    }
}
