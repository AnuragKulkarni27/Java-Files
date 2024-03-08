import java.util.ArrayList;
//leetcode 1155
public class leetcodeDice {
    public static void main(String[] args) {
        diceFace("", 4,2);
        System.out.println(diceFaceRet("", 4,2));
    }
    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }
    static ArrayList<String> diceFaceRet(String p, int target, int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceRet(p + i, target - i, face));
        }
        return list;
    }
}
