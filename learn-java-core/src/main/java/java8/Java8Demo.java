package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author adiyatmubarak
 */
public class Java8Demo {
    
    private static boolean isLargerThan32(final int x) {
        return x > 32;
    } 
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 2, 8, 2, 9, 32, 89, 54, 26, 75);
        
//        System.out.println(
//                numbers.stream().filter(Java8Demo::isLargerThan32)
//                                .reduce((x, y) -> x + y)
//                                .get()
//        );
        
        
        System.out.println(IntStream.rangeClosed(2, 10).filter(x -> x > 5).reduce((x, y) -> x + y).getAsInt());
    }
}
