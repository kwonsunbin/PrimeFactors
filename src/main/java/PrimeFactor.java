import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<>();
        while (number % 2 == 0) {
            factors.add(2);
            number /= 2;
        }
        if (number > 1) {
            factors.add(number);
        }
        return factors;
    }
}
