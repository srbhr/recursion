# Subset Sum

This problems discusses two different problems which can be found at [1](https://practice.geeksforgeeks.org/problems/subset-sums2234/1) and [2](https://leetcode.com/problems/subsets-ii/).
This is created with the help of [resources](https://www.youtube.com/watch?v=RIn3gOkbhQE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12) provided by take you forward.

## Subset Sum 1

[Link](https://takeuforward.org/data-structure/subset-sum-sum-of-all-subsets/)

```Java

import java.util.*;

class SubsetSum1 {
    static void func(int ind, int sum, ArrayList < Integer > arr, int N, ArrayList < Integer > sumSubset) {
        if (ind == N) {
            sumSubset.add(sum);
            return;
        }

        // pick the element
        func(ind + 1, sum + arr.get(ind), arr, N, sumSubset);

        // Do-not pick the element
        func(ind + 1, sum, arr, N, sumSubset);
    }

    static ArrayList < Integer > subsetSums(ArrayList < Integer > arr, int N) {

        ArrayList < Integer > sumSubset = new ArrayList < > ();
        func(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }



    public static void main(String args[]) {


        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = subsetSums(arr, arr.size());
        Collections.sort(ans);
        System.out.println("The sum of each subset is ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }

}

```

...

## Subset Sum 2

[Blog Link](https://takeuforward.org/data-structure/subset-ii-print-all-the-unique-subsets/)

```Java

import java.util.*;


class SubsetSum2 {
    static void printAns(List < String > ans) {
        System.out.println("The unique subsets are ");
        System.out.println(ans.toString().replace(",", " "));
    }
    public static void fun(int[] nums, int index, List < Integer > ds, HashSet < String > res) {
        if (index == nums.length) {
            Collections.sort(ds);
            res.add(ds.toString());
            return;
        }
        ds.add(nums[index]);
        fun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds, res);
    }
    public static List < String > subsetsWithDup(int[] nums) {
        List < String > ans = new ArrayList < > ();
        HashSet < String > res = new HashSet < > ();
        List < Integer > ds = new ArrayList < > ();
        fun(nums, 0, ds, res);
        for (String it: res) {
            ans.add(it);
        }
        return ans;
    }

    public static void main(String args[]) {
        int nums[]={1,2,2};
        List < String > ans = subsetsWithDup(nums);
        printAns(ans);

    }

}

```
