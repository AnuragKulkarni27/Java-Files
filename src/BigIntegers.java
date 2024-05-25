import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
        //BD();
        BI();
    }
    static void BD(){
        BigDecimal x = new BigDecimal("0.03");
        BigDecimal y = new BigDecimal("0.04");
        BigDecimal ans = y.subtract(x);
        System.out.println(ans);
        BigDecimal a = new BigDecimal("456576345675.4546376");
        BigDecimal b = new BigDecimal("547634565352.986785764");
        System.out.println(b.add(a));
        System.out.println(b.subtract(a));
        System.out.println(b.multiply(a));
        System.out.println(b.pow(2));
        System.out.println(b.negate());
        BigDecimal con = BigDecimal.ONE;
    }
    static void BI(){
        BigInteger b=BigInteger.valueOf(4); // convert int/long to BI
        BigInteger c=BigInteger.valueOf(6);
        int d = b.intValue(); // convert BI to int
        BigInteger s = b.add(c);
        BigInteger m = b.multiply(c);
        BigInteger sub = b.subtract(c);
        BigInteger di = b.divide(c);
        BigInteger rem = b.remainder(c);
        if(b.compareTo(c)<0){
            System.out.println("YES");
        }
        System.out.println(Factclass.factoriaal(100));
    }
}