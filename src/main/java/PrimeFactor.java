import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int divisor = 2; n > 1; divisor++) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
        }
        return factors;
    }
}
