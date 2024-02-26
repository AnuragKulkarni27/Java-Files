public class Pattern {
    public static void main(String[] args){
        int originalN = 4;
        int n = 6;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n - row, n - col)); // min of value from top bottom left & right
                System.out.print(atEveryIndex + " ");
            }
            System.out.println(); //newline
        }
    }
}

