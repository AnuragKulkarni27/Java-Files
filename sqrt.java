public class sqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // for correct decimal value upto p
        System.out.println(newtonsqrt(n));
        System.out.printf("%.3f", squarrot(n, p));
    }
    static double newtonsqrt(double n){
        double x = n;
        double root;
        while(true){
            root = (x + (n/x))/2;

            if(Math.abs(root - x) < 0.5){ //abs is for absolute value
                break;
            }
            x = root;
        }
        return root;
    }
    static double squarrot(int n ,int p){
        int s=0;
        int e=n;
        double root =0.0;
        while(s<=e){
            int m = s + (e-s)/2;
            if(m*m == n){
                return m;
            }
            if(m*m > n){
                e=m-1;
            }
        else{
            s=m+1;
            root=m;
        }
        }
        double inc=0.1;
        for(int i=1;i<p;i++){
            while(root*root <= n){
                root+=inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
