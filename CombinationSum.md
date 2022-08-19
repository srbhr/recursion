# Combination Sum

This problems discusses two different problems which can be found at [1](https://leetcode.com/problems/combination-sum/) and [2](https://leetcode.com/problems/combination-sum-ii/).
This is created with the help of [resources]() provided by take you forward.

## Combination Sum 1

[Problem Link](https://leetcode.com/problems/combination-sum/)

[Blog Link](https://takeuforward.org/data-structure/combination-sum-1/)

```Java

import java.io.*;
import java.util.*;
class Solution {

    private void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList < > (ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }
    public List < List < Integer >> combinationSum(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        int arr[] = {2,3,6,7};
        int target = 7;
        Solution sol = new Solution();
        List < List < Integer >> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

```

...

## Combination Sum 2

[Problem Link](https://leetcode.com/problems/combination-sum-ii/)

[Blog Link](https://takeuforward.org/data-structure/combination-sum-ii-find-all-unique-combinations/)

```Java

import java.util.*;


class CombinationSum2 {
    static void findCombinations(int ind, int[] arr, int target, List < List < Integer >> ans, List < Integer > ds) {
        if (target == 0) {
            ans.add(new ArrayList < > (ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue;
            if (arr[i] > target) break;

            ds.add(arr[i]);
            findCombinations(i + 1, arr, target - arr[i], ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public static List < List < Integer >> combinationSum2(int[] candidates, int target) {
        List < List < Integer >> ans = new ArrayList < > ();
        Arrays.sort(candidates);
        findCombinations(0, candidates, target, ans, new ArrayList < > ());
        return ans;
    }

    public static void main(String args[]) {
        int v[]={10,1,2,7,6,1,5};
        List < List < Integer >> comb = combinationSum2(v, 8);
        System.out.println(comb.toString().replace(",", " "));
    }
}

```
