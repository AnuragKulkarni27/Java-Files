public class Palindrome {
    public static void main(String[] args){
        String str = "abcba";
        System.out.println(isPalindrome(str));

    }
    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) { //null pehle likhenge kuki java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
            return false;
        }
        str = str.toLowerCase();
            char start = str.charAt(0);
            char end = str.charAt(str.length() - 1);
            while(start<end){
            if(start != end){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
