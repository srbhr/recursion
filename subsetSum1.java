import java.util.*;

public class subsetSum1 {
    public static void subset(int index, int[] arr, int sum, ArrayList<Integer> ds, ArrayList<Integer> sumSets) {
        if (index == arr.length) {
            sumSets.add(sum);
            return;
        }

        // condition to pick

        ds.add(arr[index]);
        subset(index + 1, arr, sum + arr[index], ds, sumSets);
        ds.remove(ds.size() - 1);

        // condition to not pick
        subset(index + 1, arr, sum, ds, sumSets);
    }

    public static void makeSums(int[] arr) {
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<Integer> sumSets = new ArrayList<>();
        subset(0, arr, 0, ds, sumSets);
        sumSets.sort(null);
        System.out.println(sumSets);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };

        makeSums(arr);
    }
}
