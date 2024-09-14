import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferreader {
    public static void main(String[] args) {
        //byte to char stream and then reading char stream
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("You Typed:"+br.readLine());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        try(BufferedReader br=new BufferedReader(new FileReader("word.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    } 
}