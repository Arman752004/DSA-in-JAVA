package Oops;

public class Main {
    public static void main(String[] args) {
        
    
        //Student[] students = new Student[5];

        //just declaring
        //Student kunal;
        //kunal = new Student();

        Student kunal = new Student();

        // kunal.rno = 13;
        // kunal.name = "Kunal Kushwaha";
        // kunal.marks = 85.4f;

        kunal.changeName("Arman");
        kunal.greeting();

        // System.out.println(kunal.rno);
        // System.out.println(kunal.name);
        // System.out.println(kunal.marks);

        Student random = new Student(kunal);        //other<->kunal,this<->random replaced
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}

//create a class
//for every single student
class Student{
    int rno;
    String name;
    float marks = 90;       //default value which will not change

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }

    //we need a way to add a value of the above
    //properties object by object

    //we need one word to access every object


    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    // Student(){              //constructor
    //     this.rno = 13;
    //     this.name = "Kunal Kushwaha";
    //     this.marks = 88.5f;
    // }

    Student(){
        //this is how you call constructor from another constructor
        //internally: new Student()
        this(13,"default",100.0f);
    }

    //Student arpit = new Student(17,"Arpit",89.7f);
    //here this will be replaced with arpit
    Student(int roll,String name,float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
