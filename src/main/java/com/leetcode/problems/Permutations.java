package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] array) {
        List<List<Integer>> list = new ArrayList<>();

        // Use Backtracking approach
        backtrack(list, new ArrayList<>(), array);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temporaryList, int[] array) {

        if(temporaryList.size() == array.length){
            list.add(new ArrayList<>(temporaryList));
        }
        else {
            for (int i = 0; i <array.length ; i++) {
                if(temporaryList.contains(array[i])) continue;
                temporaryList.add(array[i]);
                backtrack(list, temporaryList, array);
                temporaryList.remove(temporaryList.size()-1);
            }
        }

    }
}
