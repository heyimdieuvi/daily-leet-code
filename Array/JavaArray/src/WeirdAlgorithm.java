import java.util.*;

public class WeirdAlgorithm {
//    public static void Solution(int num) {
//        long n = (long) num;
//        System.out.println(n + " ");
//        while (n  != 1) {
//            if (n % 2 == 0) {
//                n = n / 2;
//                System.out.print(n + " ");
//            } else {
//                n = n * 3 + 1;
//                System.out.print(n + " ");
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(n + " ");
        while (n  != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else {
                n = n * 3 + 1;
                System.out.print(n + " ");
            }
        }
        }

}
