package basicjava;

/**
 *
 * @author adiyatmubarak
 */
import java.util.List;
import java.util.ArrayList;

public class Rec {

    private static String generate(List<String> data, int counter, String result) {
        result += data.get(0);
        result += data.get(1);
        result += " ";
        
        if (data.size() == 2) {
            return result;
        } else {
            System.out.println(data);
            return generate(data.subList(counter + 1, data.size()), counter + 1, result);
        }
    }

    public static void main(String[] x) {
        List<String> data = new ArrayList<>();
        data.add("A");
        data.add("B");
        data.add("C");
        data.add("D");
        data.add("E");
        data.add("F");
        data.add("G");
        data.add("H");
        
        System.out.println(Rec.generate(data, 0, ""));
    }
}