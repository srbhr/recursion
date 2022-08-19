# Print permutations of an array/string

This problems discusses a problem which can be found at [1](https://leetcode.com/problems/permutations/). This is created with the help of [resources](https://www.youtube.com/watch?v=RIn3gOkbhQE&list=PLgUwDviBIf0rGlzIn_7rsaR2FQ5e6ZOL9&index=12) provided by take you forward.

[Problem Link](https://leetcode.com/problems/permutations/)

[Blog Link](https://takeuforward.org/data-structure/print-all-permutations-of-a-string-array/)

## Approach 1

```Java

import java.io.*;
import java.util.*;
class Solution {
    private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            // copy the ds to ans
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> ans = new ArrayList < > ();
        recurPermute(0, nums, ans);
        return ans;
    }
};

class TUF {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Solution sol = new Solution();
        List < List < Integer >> ls = sol.permute(nums);
        System.out.println("All Permutations are");
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

## Approach 2

```Java


import java.io.*;
import java.util.*;
class Solution {
    private void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            // copy the ds to ans
            List < Integer > ds = new ArrayList < > ();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList < > (ds));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List < List < Integer >> permute(int[] nums) {
        List < List < Integer >> ans = new ArrayList < > ();
        recurPermute(0, nums, ans);
        return ans;
    }
};

class TUF {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        Solution sol = new Solution();
        List < List < Integer >> ls = sol.permute(nums);
        System.out.println("All Permutations are ");
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.get(i).size(); j++) {
                System.out.print(ls.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

```
