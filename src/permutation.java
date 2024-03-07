import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        ArrayList<String> ans = permu("", "abc");
        System.out.println(ans);
        System.out.println(permutationcount("", "abcd"));
    }
    static ArrayList<String> permu (String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permu(f + ch + s, up.substring(1)));
        }
        return ans;
    }
    static int permutationcount(String p, String up){
        if(up.isEmpty()) return 1;
        int c =0;
        char ch = up.charAt(0);
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            c=c+permutationcount(f + ch + s, up.substring(1));
        }
        return c;
    }
}
