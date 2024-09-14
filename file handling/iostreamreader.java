import java.io.IOException;
import java.io.*;
//taking input in byte stream and putting it out in charachter stream
class demo{
    public static void main(String[] args){
        try(InputStreamReader isr=new InputStreamReader(System.in)){
            System.out.println("enter some letters");
            int letters=isr.read();
            while(isr.ready()){
                System.out.println((char)letters);
                letters=isr.read();
            }
            isr.close();;
            System.out.println();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }     
    }
}