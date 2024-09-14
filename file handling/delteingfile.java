import java.io.File;
import java.io.IOException;

public class delteingfile {
    public static void main(String[] args) {
        try{
            File fo=new File("del.txt");
            fo.createNewFile();
            if(fo.delete()){//fo.delete only return true or false
                System.out.println(fo.getName());
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
