import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class Main {
//    public static void main(String[] args) {
//
//        String input = "A man, a plan, a canal: Panama";
//        System.out.println(input);
//        System.out.println("Hello world!" + isPalindrome(input));
//        String[] words = input.split("\\s"); // Split by whitespace
////        for (String word : words) {
////            System.out.println(word);
////        }
//        //System.out.println("hi" + strStr("sadbutsads", "sad"));
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            i++;
//        }
//    }
    public static boolean isPalindrome(String x) {
        if (x.isEmpty()) {
            return false;
        }
        x = x.replace("[^a-zA-Z0-9]", "").toLowerCase(); //remove whitespace
        //can use [\\W_] == [^a-zA-Z0-9]
        System.out.println("Coverted: " + x);
        int i = 0;
        int j = x.length() - 1;
        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length() || haystack.isEmpty() || needle.isEmpty()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) { //chỗ này chỉ xét chuỗi cha tới vị trí có
            // độ dài hợp lí, phần còn lại < target nên ko tính
            //tìm kiếm substring(i, i + target.length.index)
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    //thấy ko khớp => kết thúc vòng for nhỏ => đến for lớn => đến i tiếp theo
                    break;
                }
            }
            //kết thúc vòng for và nếu j = 3 = needle.length() => ghi lại i = index
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    public static int indexOfSubstring(String str, String target) {
        if (str == null || target == null || str.length() < target.length()) {
            System.out.println("Invalid input: either 'str' or 'target' is null, or 'target' is longer than 'str'.");
            return -1; // Handle null or invalid inputs
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Checking substring starting at index: " + i);
            int j;
            for (j = 0; j < target.length(); j++) {
                System.out.println("Comparing str.charAt(" + (i + j) + ") = " + str.charAt(i + j)
                        + " with target.charAt(" + j + ") = " + target.charAt(j));
                if (str.charAt(i + j) != target.charAt(j)) {
                    System.out.println("Characters do not match. Breaking out of inner loop.");
                    break; // Break if characters don't match
                }
            }
            if (j == target.length()) {
                System.out.println("Match found at index: " + i);
                return i; // Return the starting index of the substring
            }
        }

        System.out.println("Substring not found.");
        return -1; // Return -1 if not found
    }

    public static int lengthOfLastWord(String s) {
        int c = 0;
        for (int i = s.trim().length() - 1; i >=  0; i--) {
            if (s.trim().charAt(i) == ' ') {
                return c;
            }
            c++;
        }
        return c;
    }
    public static String longestCommonPrefix(String[] strs) {
        //if (strs.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        int max = strs.length;
        int j = 0;
        int i = 0;
        String a = strs[0];
        while (j < strs[i].length()) {
            if (a.charAt(j) == strs[i].charAt(j)) {
                i++;
            } else {
                return result.toString();
            }
            if (i == max) {
                result.append(a.charAt(j));
                i = 0;
                j++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //System.out.println("Result: " + indexOfSubstring("sadbutsad", "sad")); // Expected: 6
        //System.out.println("Result: " + indexOfSubstring("butsadsad", "sad"));  // Expected: -1 //i <= 6
        //String input = "   fly me   to   the moon  ";
//        System.out.println(input);
//        System.out.println("Hello world!" + isPalindrome(input));
        //String[] words = input.split("\\s"); // Split by whitespace
        //int len = words[words.length - 1].length();
        //System.out.println("length = " + lengthOfLastWord(input));
        //char c = 65;
        //System.out.println(c);
        //c++;
//        System.out.println(titleToNumber("FXSHRXW"));
//        System.out.println(Math.pow(26, 0));
        //System.out.println((int)'Z' - 64);
        //String[] strs = {"flower","flow","flight"};
        //System.out.println(longestCommonPrefix(strs));
        //System.out.println(strs[0].charAt(1));
        //System.out.println(convertToTitle(1));
        //System.out.println("Ugly: " + isUgly(33));
       // System.out.println(14 % 2);
        //int[] nums = {0,1,2,2,3,0,4,2};
        //System.out.println("Ans: " + removeElement(nums, 2));
        IntegerToRoman sol = new IntegerToRoman();
        sol.length(3445);
        System.out.println(sol.intToRoman(3445));
    }
    public static int titleToNumber(String x) {
        int ans = 0;
        int pow = x.length();
        for (int i = 0; i < x.length(); i++) {
            pow--;
            ans += (int) (((int)x.charAt(i) - 64 )*Math.pow(26,pow));

            System.out.println("pow = " + pow);
            System.out.println("i = " + i);
            System.out.println("ans = " + ans);
        }
        return ans;
    }
    public static String convertToTitle(int x) {
        StringBuilder ans = new StringBuilder();
        int a = 0;
        while (x > 0) {
            a = x % 26;
            char c = (char) ((char)a + 64);
            if (a == 0) {
                x--;
                ans.insert(0, c);
            } else ans.insert(0, c);
            x /= 26;
        }
        return ans.toString();
    }
    public static boolean isUgly(int n) {

        if (n <= 0) return false;
        if (n == 1) return true;
        int r = 0;
            r = n % 30;
            System.out.println("r = " + r);
            System.out.println("n = " + n);
            if (r != 0) {
                if (r == 1) return false;
                return r % 7 != 0 && r % 11 != 0 && r % 13 != 0 && r % 17 != 0 && r % 19 != 0 && r % 23 != 0 && r % 29 != 0;
            }
        return true;
    }
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
            } else nums[i - k] = nums[i];
        }

        System.out.println(Arrays.toString(nums));
        return nums.length - k;
    }


}