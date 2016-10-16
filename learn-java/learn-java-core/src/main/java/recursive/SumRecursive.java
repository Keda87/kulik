package recursive;

/**
 *
 * @author adiyatmubarak
 */
public class SumRecursive {
    
    private int sum(int[] data, int n) {
        if (n == 1) {
            return data[n];
        } else {
            return data[n] + sum(data, n - 1);
        }
    }
    
    public static void main(String[] args) {
        int[] listNumber = new int[]{1, 4, 3, 6, 5, 2};
        SumRecursive s = new SumRecursive();
        System.out.println(s.sum(listNumber, listNumber.length - 1));
        
    }
}
