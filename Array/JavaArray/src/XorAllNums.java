import java.util.Arrays;

public class XorAllNums {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int res = nums1[0] ^ nums2[0];
        //Arrays.sort(nums1);

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (nums1[i] != nums2[j]) {
                    res ^= (nums1[i] ^ nums2[j]);
                    System.out.print(nums1[i] +"^"+nums2[j] +"="+(nums1[i] ^ nums2[j]));
                    System.out.println("---res =" + res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        XorAllNums a = new XorAllNums();
        System.out.println(100&1);
//        System.out.println(a.xorAllNums(new int[]{2,1,3}, new int[]{9,9}));
    }
}
