import java.util.*;

public class CombinationSum {
    public static void combination(int[] arr, int index, int sum, ArrayList<Integer> ds) {

        // if selected numbers exceed the sum or we go over the array
        if (sum < 0 || index >= arr.length) {
            return;
        }

        // if we got the array with required sum.
        if (sum == 0) {
            System.out.println(ds);
        }

        // edge case if the element we've selected is zero or greater than sum
        if (arr[index] == 0 || arr[index] > sum) {
            combination(arr, index + 1, sum, ds);
        }

        ds.add(arr[index]);
        combination(arr, index, sum - arr[index], ds);
        ds.remove(ds.size() - 1);

        combination(arr, index + 1, sum, ds);

    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 7 };
        int sum = 7;

        ArrayList<Integer> ds = new ArrayList<>();
        combination(arr, 0, sum, ds);

    }

}

/* TODO: Improve the code or add the shortcomings in here! */
