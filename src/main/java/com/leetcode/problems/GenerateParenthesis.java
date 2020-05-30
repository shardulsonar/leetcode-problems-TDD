package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateAllPossibleParenthesis(int num) {

        String initialValue = "";
        int numberOfOpenBrackets = 0;
        int numberOfCloseBrackets = 0;
        List<String> solution = new ArrayList<>();
        generateParenthesisRecursively(initialValue,numberOfOpenBrackets ,numberOfCloseBrackets, num, solution);
        return solution;
    }

    private void generateParenthesisRecursively(String currentString, int numberOfOpenBrackets, int numberOfCloseBrackets, int num, List<String> solution) {
        if(numberOfOpenBrackets + numberOfCloseBrackets == 2*num){
            solution.add(currentString);
            return;
        }

        if(numberOfCloseBrackets > numberOfOpenBrackets){
            return;
        }
        if(numberOfOpenBrackets < num){
            generateParenthesisRecursively(currentString + "(", numberOfOpenBrackets + 1, numberOfCloseBrackets, num, solution);
        }

        if(numberOfOpenBrackets > numberOfCloseBrackets){
            generateParenthesisRecursively(currentString + ")", numberOfOpenBrackets, numberOfCloseBrackets + 1, num, solution);
        }
    }
}
