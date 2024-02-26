import java.util.Scanner;
public class inputfor2dary {
    public static void main(String[] args){

        Scanner i = new Scanner(System.in);
        int[][] matrix = new int[3][2];

        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col]= i.nextInt();
            }

        }
        for (int r = 0; r < matrix.length; r++){
            for (int c = 0; c < matrix[r].length; c++){
                System.out.println(matrix[r][c] + " ");
            }
            System.out.println();
    }
    i.close();
}
}