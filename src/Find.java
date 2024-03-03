import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        System.out.println(find(arr, 4, 0));//returning if element exists or not
        System.out.println(findindex(arr, 4, 0));//returning where the element is located
        System.out.println(findindexlast(arr, 4, arr.length-1));//returning from last
        findallindex(arr, 4, 0);//declaring the variable " list " outside the function
        System.out.println(list);//printing the list from findallindex function
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);//returning the list of elements repeated
        System.out.println(ans);System.out.println(list); //printing the list from findAllIndex function
        System.out.println(findallindex2(arr, 4, 0));//declaring the variable " list " inside the function
}
    static boolean find(int[] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findindex(int[] arr,int target, int index){
        if(index == arr.length) return -1;
        if(arr[index] == target) return index;
        else return findindex(arr, target, index+1);
    }
    static int findindexlast(int[] arr,int target, int index){
        if(index==-1) return-1;
        if(arr[index]==target) return index;
        else return findindexlast(arr, target, index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findallindex(int[] arr,int target, int index){
        if(index == arr.length) return;
        if(arr[index]==target) list.add(index);
        findallindex(arr, target, index+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
    static ArrayList<Integer> findallindex2(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findallindex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
