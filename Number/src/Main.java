import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //System.out.println("check palindrome 121: " + isPalindrome(121) );
        //System.out.println(-321/10+-1);
        int[] a = {1,2,3};
        System.out.println(countSubArray(a));
        List<Integer> list = new ArrayList<>();

        ((ArrayList<Integer>)list).ensureCapacity(100);
    }
    public static boolean isPalindrome(int x) {
        //must have this to reduce time complexity
        //if last digital of x is zero -> palindrome said that first digital must be 0 => false except x = 0
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int a = x;
        int sum = 0;
        while (a > 0) {
            sum = sum*10 + (a % 10);
            a = a / 10;
            System.out.println(sum);
        }
        return x == sum;
    }
    public static int reverse(int x) {
        long y = 0;
        while (x != 0) {
            y = y*10 + x%10;
            x /= 10;
        }
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) return 0;
        return (int) y;
    }
    public static int countSubArray(int[] x) {
        int count = 0;
        int n = x.length;
        float m = 1;
        for (int i = 1; i < x.length; i++) {
            n *= (n - i);
            m += (float) 1 /(x.length - i);
            System.out.println("n = " + n);
            System.out.println("m = " + m);
        }
        return (int) ((int) n*m);
    }
}