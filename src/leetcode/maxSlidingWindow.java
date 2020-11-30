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
        }
        return res;
    }
}
