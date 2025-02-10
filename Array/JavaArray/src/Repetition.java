import java.util.HashMap;
import java.util.Scanner;

public class Repetition {
    public static int solution(String s) {
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else if (s.charAt(i - 1) == s.charAt(i)){
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.replace(s.charAt(i - 1), 1);
            }
            if (map.get(s.charAt(i)) > max) max = map.get(s.charAt(i));
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }
}
