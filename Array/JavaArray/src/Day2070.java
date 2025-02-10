import java.util.Arrays;
import java.util.Comparator;

public class Day2070 {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        System.out.println(Arrays.deepToString(new int[6][2]));
        return new int[]{5};
    }
    public static int binarySearch(int[] arr, int target) {
        int right = arr.length - 1;
        int left = 0;
        //khi nào dừng, khi left > right
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        //not found
        return -1;
    }

    public static void main(String[] args) {
         int[][] arr2D = new int[][]{{1,2},{3,5},{2,4},{5,6},{3,2}};
         Arrays.sort(arr2D, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
        System.out.println(arr2D[1][0]);
        System.out.println(Arrays.deepToString(arr2D));
        int x = arr2D.length;
       // System.out.println(binarySearch(new int[]{1,2,3,3,5}, 3));
    }
}
