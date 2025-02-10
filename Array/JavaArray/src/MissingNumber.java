import java.util.Scanner;

public class MissingNumber {
    public static long solution(int n, int[] arr) {
        long sum = (long) n * (n + 1) / 2;
        for (int j : arr) {
            sum -= j;
        }
        return sum;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        int[] arr = new int[n];
//        String[] x = sc.nextLine().trim().split(" ");
//        for(int i = 0; i < n - 1; i++) {
//            arr[i] = Integer.parseInt(x[i]);
//        }
//        System.out.print(solution(n, arr));
        System.out.println(MaxScore.maxScore("011101"));
    }
}
