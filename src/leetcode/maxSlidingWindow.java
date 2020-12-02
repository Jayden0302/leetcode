/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

import java.util.*;

/**
 *
 * @author User
 */
public class maxSlidingWindow {
<<<<<<< HEAD

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length + 1 - k];
        Integer count;
        SortedMap<Integer, Integer> sm = new TreeMap<Integer, Integer>();
        for (int i = 0; i < k; i++) {
            count = sm.get(nums[i]);
            if (count == null) {
                sm.put(new Integer(nums[i]), 1);
            } else {
                sm.put(new Integer(nums[i]), count + 1);
            }
        }
        res[0] = sm.lastKey();
        for (int i = k; i < nums.length; i++) {

            count = sm.get(nums[i - k]);
            if (count == 1) {
                sm.remove(new Integer(nums[i - k]));
            } else {
                sm.put(new Integer(nums[i - k]), count - 1);
            }

            count = sm.get(nums[i]);
            if (count == null) {
                sm.put(new Integer(nums[i]), 1);
            } else {
                sm.put(new Integer(nums[i]), count + 1);
            }

            res[i - k + 1] = (int) sm.lastKey();
        }

        int len = nums.length;
        int resultLength = nums.length - k + 1;

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int max;
        for (int i = 0; i < nums.length; i += k) {
            max = nums[i];
            int lastIndex = (i + k - 1 >= len) ? (len - 1) : (i + k - 1);

            // calculate max num in blocks of k from left -> right
            // (every block will be of k size except last one)
            for (int j = i; j <= lastIndex; j++) {
                max = Math.max(max, nums[j]);
                left[j] = max;
            }

            // calculate max num in blocks of k from right -> left 
            // (every block will be of k size except last one)
            max = nums[lastIndex];
            for (int j = lastIndex; j >= i; j--) {
                max = Math.max(max, nums[j]);
                right[j] = max;
            }
        }

        int[] result = new int[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = Math.max(left[i + k - 1], right[i]);
=======
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int [nums.length + 1 - k];
        Integer count;
        SortedMap<Integer, Integer> sm = new TreeMap<Integer,Integer>();
        for ( int i = 0 ; i < k ; i ++){
             count = sm.get(nums[i]);
            if (count == null) sm.put(new Integer(nums[i]),1);
            else sm.put(new Integer(nums[i]), count + 1);
        }
        res [0] = sm.lastKey();
        for ( int i = k ; i < nums.length ; i ++){
            
            
            count = sm.get(nums[i-k]);
            if (count == 1) sm.remove(new Integer(nums[i-k])); 
            else sm.put(new Integer(nums[i-k]), count - 1);
            
            
            count = sm.get(nums[i]);
            if (count == null) sm.put(new Integer(nums[i]),1);
            else sm.put(new Integer(nums[i]), count + 1);
            
            
            res [i-k+1] =(int) sm.lastKey();
>>>>>>> 108681768d06433b5b033fdaf21c03e0c8a966d7
        }
        return res;
    }
}
