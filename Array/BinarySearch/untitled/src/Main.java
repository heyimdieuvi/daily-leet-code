import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        int[] arr = {1, 3};
//        System.out.println("Binary Search is O(log2(n)) with sorted array (ascending): ");
//        System.out.println("Position: " + binarySearch(arr, 90));
//        System.out.println("Second Largest: " + findSecondLargest(arr));
//        arr = rotateArray(arr);
//        System.out.println("Rotate Array: " + Arrays.toString(arr));
//        rotateArray2(arr);
//        System.out.println("Rotate Array 2: " + Arrays.toString(arr));
        System.out.println(searchInsert(arr, 2));
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
    public static int findSecondLargest(int[] arr) {
        //th1: arr null or empty
        //th2: having 2 2st largest
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
                System.out.println("yes");
            }
            System.out.println("i = " + i);
        }
        return secondLargest;

    }
    //find index of second largest

    public static int[] rotateArray(int[] arr) {
        //exception handler
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[j] = arr [i];
            //logger.info("temp[" + j + "] = " + temp[j]);
            j++;
        }
        return temp;
    }
    public static void rotateArray2 (int[] arr) {
        int i = 0, j = arr.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int mid = 0;
        while (first <= last) {
            mid = first + (last - first)/2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) {
                first = mid + 1;
            }
            if (target < nums[mid]) {
                last = mid - 1;
            }
        }
//        if (target > nums[mid])
//            return mid + 1;
//        else if (target < nums[mid])
//            return mid;
        return first;

    }

}