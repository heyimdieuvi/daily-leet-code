import java.sql.SQLOutput;

public class DivideTwoInt {
    public static int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
        if (a == Integer.MIN_VALUE && b == 1) return Integer.MIN_VALUE;
        if (b == 1) return a;
        boolean sign = (a < 0) ^ (b < 0);

        int absA = Math.abs(a), absB = Math.abs(b);

        int quotient = 0;
        while (absA >= absB) {
            int tempB = absB, count = 1;
            while (absA >= (tempB << 1)) {
                //System.out.println(tempB + " " + count);
                tempB <<= 1;
                count <<= 1;
            }
            //System.out.println(tempB + " " + count);
            quotient += count;
            absA -= tempB;

        }
        return sign ? -quotient : quotient;
    }

    public static void main(String[] args) {
       // divide(2147483646, 3);
        System.out.println(-2<<1);
    }
}
