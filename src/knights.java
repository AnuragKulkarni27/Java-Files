import java.util.ArrayList;
import java.util.List;

public class knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        //List<String>ll=new ArrayList<>();
        //List<List<String>> ans=new ArrayList<>();
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int row){
        List<String>ll=new ArrayList<>();
        List<List<String>> ans=new ArrayList<>();
        if(row == board.length){
            System.out.println(display(board,ll,ans));
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0; col< board.length;col++){
            if(isSafe(board, row, col)){
                board[row][col] =true;
                count+= queens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) return false;
        }
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) return false;
        }
        return true;
    }
    private static List<List<String>> display(boolean[][] board, List<String>ll, List<List<String>>ans){
    for(boolean[] row : board){
        String s="";
        for(boolean element : row){
            if(element) s=s+'Q';
            else s+='.';
        }
        ll.add(s);
    }
    ans.add(new ArrayList<>(ll));
            ll.clear();
            return ans;
}
}
