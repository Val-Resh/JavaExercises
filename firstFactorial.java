import java.math.BigInteger;

public class FirstFactorial {
    /*PROBLEM:
    Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
    For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
    For the test cases, the range will be between 1 and 18 and the input will always be an integer.
     */

        public static BigInteger firstFactorial(int num) {
            BigInteger solution = new BigInteger("1");
            for (int i = 1; i <= num; i++){
                solution = solution.multiply(BigInteger.valueOf(i));
            }
            return solution;
        }
 }
