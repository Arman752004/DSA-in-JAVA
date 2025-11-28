package FileHandling;

import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.io.OutputStreamWriter;
import java.io.File;

public class Main {
    public static void main(String[] args) {
    //     input
    
    //     try(InputStreamReader isr = new InputStreamReader(System.in)){
    //         System.out.print("Enter some Letters:");
    //         int letters = isr.read();
    //         while (isr.ready()) {
    //             System.out.println((char)letters);
    //             letters = isr.read();
    //         }
    //         System.out.println();
    //     }catch(IOException e){
    //         System.out.println(e.getMessage());
    //     }
     
    // try (FileReader fr = new FileReader("note.txt")) {
    //     int letters;
    //     while ((letters = fr.read()) != -1) {  // read() returns -1 when EOF is reached
    //         System.out.print((char) letters);
    //     }
    //     System.out.println();
    //     } catch (IOException e) {
    //         System.out.println(e.getMessage());
    //     }
        
    //     //byte to char stream and then reading char stream
    //     try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
    //         System.out.println("You typed: " + br.readLine());
    //     }catch(IOException e){
    //         System.out.println(e.getMessage());
    //     }

    //     //File Reader
    //     try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
    //         while (br.ready()) {
    //             br.readLine();
    //         }
    //         System.out.println("You typed: " + br.readLine());
    //     }catch(IOException e){
    //         System.out.println(e.getMessage());
    //     }


    //     output
        // OutputStream os = System.out;
        // os.write(😂);     //range is exceeded
        // System.out.println();

        // try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
        //     osw.write("Hello World");
        //     osw.write(97);
        //     osw.write(10);
        //     osw.write('A');
        //     osw.write('\n');
        //     char[] arr = "hello world".toCharArray();
        //     osw.write(arr);
        // }catch(IOException e){
        //         System.out.println(e.getMessage());
        // }

        // //File Writer
        // try(FileWriter fw = new FileWriter("note.txt",true)){       //true will help to append the letters and if we will not use true then it will override 
        //     fw.write("Hello World");
        // }catch(IOException e){
        //         System.out.println(e.getMessage());
        // }

        // //Buffered Writer
        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){       
        //     bw.write("Hare Krishna");
        // }catch(IOException e){
        //         System.out.println(e.getMessage());
        // }

        //Creating New File
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //write in the file
        try{
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("Hello World");
            fw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //reading the file
        try(BufferedReader br = new BufferedReader(new FileReader("new-file.txt"))){
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

         //Creating New File
        try{
            File fo = new File("random.txt");
            fo.createNewFile();
            if(fo.delete()){
                System.out.println(fo.getName());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
