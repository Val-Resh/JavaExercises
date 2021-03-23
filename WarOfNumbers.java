public class WarOfNumbers {
    /*PROBLEM:
    There's a great war between the even and odd numbers.
     Many numbers already lost their life in this war and it's your task to end this.
     You have to determine which group sums larger: the even, or the odd. The larger group wins.

    Create a function that takes an array of integers,
    sums the even and odd numbers separately,
    then returns a string with the winner, either "odds" or "even".

    Note: the given array contains only positive integers.
     */

    public static String oddsVsEven(int[] numbers) {
        String solution = "";
        int evenSum = 0;
        int oddSum = 0;
        for (int x : numbers) {
            if (x % 2 == 0) evenSum += x;
            else oddSum += x;
        }
        if (evenSum == oddSum) solution = "Draw.";
        else if (evenSum > oddSum) solution = "Even.";
        else solution = "Odds.";
        return solution;
    }
}
