import java.util.ArrayList;
import java.util.List;

public class AdditivePersistenceMultiplicativePersistence {
    /*PROBLEM:
    The additive persistence of an integer, n, is the number of times
    you have to replace n with the sum of its digits until n becomes a single digit integer.
    The multiplicative persistence of an integer, n, is the number of times you have to replace
    n with the product of its digits until n becomes a single digit integer.

    Create two functions that take an integer as an argument and:

    Function 1: Return its additive persistence.
    Function 2: Return its multiplicative persistence.

    The input n is never negative.
     */

    public static int additivePersistence(int n) {
        int solution = 0;
        int count = 0;
        while (n >= 10) {
            List<Integer> numbers = new ArrayList<>();
            while (n > 0) {
                numbers.add(n % 10);
                n /= 10;
            }
            for (int x : numbers){
                count += x;
            }
            n = count;
            count = 0;
            solution++;
        }
       return solution;
    }
    public static int multiplicativePersistence(int n) {
        int solution = 0;
        int count = 1;
        while (n >= 10) {
            List<Integer> numbers = new ArrayList<>();
            while (n > 0) {
                numbers.add(n % 10);
                n /= 10;
            }
            for (int x : numbers){
                count *= x;
            }
            n = count;
            count = 1;
            solution++;
        }
        return solution;
    }
}
