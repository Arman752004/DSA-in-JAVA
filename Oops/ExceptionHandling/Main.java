package Oops.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 0;
        try{
            //int c = a / b;          //Arithmatic exception
            //divide(a, b);
            String name = "Arman";
            if(name.equals("Arman")){
                throw new myException("Name is Arman");
            }
        }catch(myException e){
            System.out.println(e.getMessage());         //getting the message of exception
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());         //getting the message of exception
        }catch(Exception e){
            System.out.println("Normal Exception");         //getting the message of exception
        }finally{
            System.out.println("This will always execute!!");
        }
    }   
    static int divide (int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by 0s");
        }

        return a/b;
    }
}
