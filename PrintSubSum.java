import java.util.ArrayList;

public class PrintSubSum {
    public static void printSubSum(int indx, int[] arr, int k, ArrayList<Integer> ds, int sum) {

        if (indx == arr.length) {
            if (sum == k ) {
                System.out.println(ds);
            }
            return;
        }

        ds.add(arr[indx]);
        sum += arr[indx];

        printSubSum(indx+1, arr, k, ds, sum);

        ds.remove(ds.size()-1);
        sum-=arr[indx];

        printSubSum(indx+1, arr, k, ds, sum);
        
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        int k = 3;

        ArrayList<Integer> ds = new ArrayList<>();

        printSubSum(0, arr, k, ds, 0);
    }
}
