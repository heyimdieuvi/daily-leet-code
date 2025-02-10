import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Fibonacci {
    public static int calculateFibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        return calculateFibonacci(n - 2) + calculateFibonacci(n - 1);
    }

    public static void main(String[] args) {
        //System.out.println(calculateFibonacci(9));
//        for(int i = 0; i <= 14; i++){
//            System.out.println(calculateFibonacci(i));
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        //map.put(4, new ArrayList<>().remove(4));
        map.put(5, 2);
        //map.get(5).intValue() + 1;
        map.replace(5, map.get(5) + 1);
        //map.put(4, 3);
        //map.get(4);
        System.out.println(map.get(5));

        System.out.println(map.toString());
        //map.put(4, 2);
    }
}
