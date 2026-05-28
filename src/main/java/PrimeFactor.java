import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public static List<Integer> generate(int number) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int divisor = 2; number > 1; divisor++) {
            while (number % divisor == 0) {
                primeFactors.add(divisor);
                number /= divisor;
            }
        }
        return primeFactors;
    }
}
