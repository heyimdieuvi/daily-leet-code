public class MaxScore {
    public static int maxScore(String s) {
        int totalZero = 0;
        int totalOne = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                totalZero++;
            else totalOne++;
        }
        int max = 0;
        int sumLeft = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0')
                sumLeft++;
            else totalOne--;
            if (sumLeft + totalOne > max) max = sumLeft + totalOne;
        }

        return max;
    }
}
