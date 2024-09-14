import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
    public static void main(String[] args) {
        //rewriting hello world in word.txt
        try(FileWriter fw=new FileWriter("word.txt")){
            fw.write("hello World");
        }catch(IOException E){
            System.err.println(E.getMessage());
        }
        //appending yo yo in word.txt
        try(FileWriter fw=new FileWriter("word.txt",true)){
            fw.write(" yo yo");
        }catch(IOException E){
            System.err.println(E.getMessage());
        }
    }
}
