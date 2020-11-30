/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode;

/**
 *
 * @author User
 */
public class maxRepeating {
    public int maxRepeating(String sequence, String word) {
        int res =0;
        int counter =0 ;
        for (int i = 0; i + word.length() <= sequence.length(); i++) {
            if(sequence.substring(i, i + word.length()).equals(word)){
                counter++;
                res = Math.max(counter,res);
                i += word.length()-1;
            }else{
                counter = 0;
            }
        }
        return res;
    }
}
