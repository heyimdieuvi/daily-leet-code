public class DoesValidArrayExist {
    public boolean doesValidArrayExist(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res ^=arr[i];
        }
        return res == 0;
    }
}
