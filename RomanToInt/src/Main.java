import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(romanToInt("MDCL"));
       // String[] s = {"flower","flow","flight"};
        //String[] s = {"ad", "a"};
        //System.out.println(s[0].indexOf("\n"));
//        System.out.println(longestCommonPrefix(s));
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length = removeDuplicates(nums);
        System.out.println("Length of unique array: " + length);
    }
    public static int romanToInt(String s) {
        int res = 0;
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        for(int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))) { //tới phần tử
                                                                                    //kế cuối để check xem nó có thuộc TH đặc biệt ko thì dừng
                res -=  roman.get(s.charAt(i));
            } else res += roman.get(s.charAt(i));
        }

        return res;
    }
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char b = strs[0].charAt(i);
            //System.out.println("b: " + b);

            for (int j = 1; j < strs.length; j++) {
//                System.out.println(strs[j].length());
//                System.out.println(i);
                if (i >= strs[j].length()) return result.toString();
                if (strs[j].charAt(i) == b) {
                    System.out.println("string: "+strs[j]);
                } else {
                    System.out.println("no");
                    return result.toString();
                }
            }
            result.append(b);
        }
        return result.toString();
    }
    public boolean isValid(String s) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (a.length() == 0) {
                a.append(s.charAt(i));
            }
        }

        return false;
    }
//    public int removeDuplicates(int[] nums) {
//        //int [] ok = new int[0];
//        List<Integer> arr = new ArrayList<Integer>();
//        for (int num : nums) {
//            if (arr.isEmpty() || num != arr.get(arr.size() - 1)) {
//                arr.add((Integer) num);
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int a : arr) {
//                nums[i] = a;
//            }
//        }
//
//        return arr.size();
//    }

        public static int removeDuplicates(int[] nums) {
            int i = 0;
            for (int j = 1; j < nums.length; j++) { // Start j from 1 since nums[0] is always unique
                System.out.println("i: " + i + ", j: " + j + ", nums[i]: " + nums[i] + ", nums[j]: " + nums[j]); // Debug print
                if (nums[j] != nums[i]) {
                    nums[i + 1] = nums[j];
                    i++;
                    System.out.println("Updated nums[" + (i) + "] to " + nums[j]); // Debug update
                }
            }
            System.out.println("Final array: " + java.util.Arrays.toString(nums));
            System.out.println("Return value (length of unique array): " + (i + 1));
            return i + 1;
        }



}