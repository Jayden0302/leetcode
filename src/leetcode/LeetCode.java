package leetcode;

import java.util.NavigableMap;
import java.util.TreeMap;

public class LeetCode {

    public static void main(String[] args) {
        NavigableMap<Integer, String> nmmp = new TreeMap<>();

        // assigning the values in the NavigableMap 
        // using put() 
        nmmp.put(2, "two");
        nmmp.put(7, "seven");
        nmmp.put(3, "three");

        System.out.println("The mapping with greatest key strictly"
                + " less than 7 is : " + nmmp.lowerEntry(7));
    }
}
