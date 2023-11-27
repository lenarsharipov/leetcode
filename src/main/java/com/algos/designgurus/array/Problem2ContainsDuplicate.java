package com.algos.designgurus.array;

import java.util.HashSet;
import java.util.Set;

public class Problem2ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
