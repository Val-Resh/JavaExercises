import java.util.*;

public class FindUniqueNumber {
    /*PROBLEM:
    There is an array with some numbers. All numbers are equal except for one. Try to find it!

    findUnique(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
    findUnique(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
    It’s guaranteed that array contains at least 3 numbers.

    The tests contain some very huge arrays, so think about performance.
    */

    public static double findUnique (double[] array) {
        //insert code here
        ArrayList<Double> list = new ArrayList<>();
        for (double x : array) {
            list.add(x);
        }
        if (array.length == 3){
            if (array[0] == array[1]) return array[2];
            else if (array[1] == array[2]) return array[0];
            else return array[1];
        }
        else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == array[i + 1]) {
                    ArrayList<Double> temporary = new ArrayList<>();
                    temporary.add(array[i]);
                    list.removeAll(temporary);
                    break;
                }
            }
        }
        return list.get(0);
    }
}
