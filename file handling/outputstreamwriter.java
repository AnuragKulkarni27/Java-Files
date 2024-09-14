import java.io.IOException;
import java.io.OutputStreamWriter;

public class outputstreamwriter {
    public static void main(String[] args) {
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr="hello world".toCharArray();
            osw.write(arr);
        }catch(IOException E){
            System.err.println(E.getMessage());
        }
    }
}
