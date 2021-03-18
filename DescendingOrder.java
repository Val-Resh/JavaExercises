import java.util.ArrayList;
import java.util.Comparator;

public class DescendingOrder {
    /*PROBLEM:
    Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
    Essentially, rearrange the digits to create the highest possible number.
    Eg. 42145 -> 54421
     */

     public static int sortDesc(final int num) {
      StringBuilder string = new StringBuilder();
      ArrayList<Character> list = new ArrayList<>();
      String number = Integer.toString(num);
      for (int i = 0; i < number.length(); i++){
       list.add((number.charAt(i)));
      }
      ArrayList<Integer> numbers = new ArrayList<>();
      for (Character x : list) {
        numbers.add(Character.getNumericValue(x));
       }
      numbers.sort(Comparator.reverseOrder());
      for (int x : numbers){
          string.append(x);
      }
      return Integer.parseInt(String.valueOf(string));
     }
}
