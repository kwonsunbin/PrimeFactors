import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        if (n > 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
