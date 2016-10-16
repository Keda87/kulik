package basicjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adiyatmubarak
 */
public class BasicJava {

    /**
     * Check given integer is a prime number.
     * @param n
     * @return 
     */
    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Create list of integer contains prime number from given n parameter.
     * @param i     : end of sequence.
     * @return      : list of prime number.
     */
    private List<Integer> primeList(int i) {
        List<Integer> primes = new ArrayList<>();
        for (int j = 1; j <= i; j++) {
            if (isPrime(j)) {
                primes.add(j);
            }
        }
        return primes;
    }
    
    /**
     * Print fibonaci sequence from given `n` as end of sequence recursively
     * 
     * @param n : end of sequence.
     * @return 
     */
    private int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib (n - 2);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicJava obj = new BasicJava();
        for (int i = 0; i < 10; i++) {
            System.out.print(obj.fib(i) + " ");
        }
        System.out.println("");
        for (int i = 1; i <= 20; i++) {
            if (obj.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("Prime: " + obj.primeList(10));
    }
    
}
