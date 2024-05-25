import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class strbuffer {
    static String randomstr(int size) {
        StringBuffer sb = new StringBuffer(size);
        Random random = new Random();
        for (int i=0; i < size; i++) {
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)randomChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb2 = new StringBuffer("Anurag");

        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());

        sb.append("Hello brooooo");
        sb.append("yoooo");
        System.out.println(sb);
        sb.replace(1,5,"xyz");
        System.out.println(sb);
        sb.delete(1,5);

        String str = sb.toString();
        System.err.println(str);
        int n=20;
        String name = randomstr(n);
        System.err.println(name);
        String sentence = " Hi     Hello H  H LLLLL O O ";
        System.err.println(sentence);
        System.err.println(sentence.replaceAll("\\s", ""));
        String arr="Rahul,Shaam,Aam,Prem";
        String[] names = arr.split(",");
        System.out.println(Arrays.toString(names));
        String arr1="Rahul|Shaam|Aam|Prem";
        String[] names1 = arr1.split("|");
        System.out.println(Arrays.toString(names1));
        DecimalFormat df = new DecimalFormat("00.0000");
        System.out.println(df.format(7.29));
    }
}
