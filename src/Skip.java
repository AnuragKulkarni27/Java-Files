import java.util.ArrayList;

public class Skip {
    public static void main(String[] args){
        skip("","bacapplcdah");
        System.out.printf(skip("bacapplcdah"));
        System.out.printf("%n"); //next line
        System.out.printf(skipAppnotapple("bacappecdah"));
        System.out.printf("%n");
        System.out.println(subseqAscii("", "abc"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a') skip(p, up.substring(1));
        else skip(p+ch, up.substring(1));
    }
    static String skip(String up){
        if(up.isEmpty()) return"";
        char ch = up.charAt(0);
        if(ch=='a') return skip(up.substring(1));
        else return ch + skip(up.substring(1));
    }
    static String skipAppnotapple(String u){
        if(u.isEmpty()) return "";
        if(u.startsWith("app") && !u.startsWith("apple")) return skipAppnotapple(u.substring(3)); //skiping app but not apple in string
        else return u.charAt(0)+ skipAppnotapple(u.substring(1));
    }
    static ArrayList<String> subseqAscii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAscii(p+ch, up.substring(1));
        ArrayList<String> second = subseqAscii(p, up.substring(1));
        ArrayList<String> third = subseqAscii(p+ (ch+0), up.substring(1)); //ch+0 gives ASCII value of charachter
        first.addAll(second);
        first.addAll(third);
        return third;
    }
}
