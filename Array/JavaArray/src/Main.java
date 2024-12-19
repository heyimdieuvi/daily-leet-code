import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {3,2,4};
//        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(twoSum(nums2, 6)));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                System.out.println("i = " + i);
                nums1[k--] = nums1[i--];
                System.out.println("i = " + i);
            } else {
                System.out.println("j = " + j);
                nums1[k--] = nums2[j--];
                System.out.println("j = " + j);
            }
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        while (i < nums.length - 1) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
            if (nums[i] + nums[j] == target) {
                return new int[]{i, j};
            } else {
                if (j == nums.length - 1) {
                    i++;
                    j = i + 1;
                } else {
                    j++;
                }
            }
        }
        return null;
    }
}