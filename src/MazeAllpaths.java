import java.util.Arrays;

public class MazeAllpaths {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
    pathRestriction("", board, 0, 0);
        boolean[][] boards ={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int[][] path = new int[boards.length][boards[0].length];
        allpathprint("", boards, 0, 0, path, 1);
    }
    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]) return;
        if(r < maze.length -1) pathRestriction(p+'D', maze, r+1, c);
        if(c < maze[0].length -1) pathRestriction(p+'R', maze, r, c+1);
    }
    static void allpathprint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length -1&& c==maze[0].length-1){
            path[r][c] = step; //path ka matrix
            for(int[] arr: path) System.out.println(Arrays.toString(arr));
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]) return;
        maze[r][c] = false;//jo element traverse ho chuka hai wapas uspe na jaye isliye false liye
        path[r][c] = step;
        if(r<maze.length-1) allpathprint(p+'d', maze, r+1, c, path, step+1);
        if(c<maze[0].length-1) allpathprint(p+'r', maze, r, c+1, path, step+1);
        if(r>0) allpathprint(p+'d', maze, r-1, c, path, step+1);
        if(c>0) allpathprint(p+'d', maze, r, c-1, path, step+1);
        //yaha function over hoga
        maze[r][c] = true; //jinko traverse kiya tha next functions ke liye use wapas noramal true banana rhe h
        path[r][c] = 0; //similarly new path 0 se start kr rhe h
    }
    
}
