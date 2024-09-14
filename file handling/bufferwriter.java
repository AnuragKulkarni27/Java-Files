import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwriter {
    public static void main(String[] args) {
        //rewrites yo yo in word.txt
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("word.txt"))){
            bw.write(" yo yo");
        }catch(IOException E){
            System.err.println(E.getMessage());
        }
    }
}
