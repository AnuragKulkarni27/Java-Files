public class BinarySearchusingRecursion {
    public static void main(String[] args){
        int[] a = {1,2,3,4,55,66,78};
        int t = 10;
        System.out.println(s(a, t, 0, a.length-1));
    }
    static int s(int[] a, int t, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(a[m] == t){
            return m;
        }
        if(t < a[m]){
            return s(a, t, s, m - 1);
        }
        return s(a, t, m + 1, e);
    }
}
