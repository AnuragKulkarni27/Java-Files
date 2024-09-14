import java.io.FileReader;
import java.io.IOException;

public class filereader {
    public static void main(String[] args) {
        try(FileReader fr=new FileReader("word.txt")){
            int letters=fr.read();
            while(fr.ready()){
                System.out.println((char)letters);
                letters=fr.read();
            }
            
            System.out.println();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
