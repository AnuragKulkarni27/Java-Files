import java.io.*;

public class file {
    public static void main(String[] args) {
        //this will create a new file note.tt
        try{
            File fo=new File("note.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
        //this will write in the new file
         try(FileWriter fw=new FileWriter("note.txt")){
            fw.write("LA la la la");
            fw.close();
        }catch(IOException E){
            System.err.println(E.getMessage());
        }
        //this will read from the new file
        try(BufferedReader br=new BufferedReader(new FileReader("note.txt"))){
            while(br.ready()){
                System.out.println(br.readLine());
            }
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
