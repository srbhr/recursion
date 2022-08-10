import java.util.ArrayList;

public class MyClass {
    public static void printSubs(int[] arr, int index, ArrayList<Integer> ds ) {
        if (index == arr.length) {
            if (ds.size() > 0) {
                System.out.println(ds);
            }
            return;
        }
        // the condition to take an
        // element from the main sequence
        ds.add(arr[index]);
        printSubs(arr, index + 1, ds); // function call - 1
        ds.remove(ds.size() - 1);

        // the condition to not take an
        // element for the main sequence.
        printSubs(arr, index + 1, ds); // function call - 2
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        ArrayList<Integer> ds = new ArrayList<>();
        printSubs(arr, 0, ds);
    }
}