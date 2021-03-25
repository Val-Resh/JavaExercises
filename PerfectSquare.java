
public class PerfectSquare {
    /*PROBLEM:
    Given an integral number, determine if it's a square number/perfect square,
    returning true or false accordingly.
     */

    public static boolean isPerfectSquare(int n) { 
        return Math.sqrt(n) - Math.floor(Math.sqrt(n)) == 0;
    }
}
