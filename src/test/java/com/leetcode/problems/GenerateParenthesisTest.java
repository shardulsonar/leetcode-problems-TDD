package com.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesisTest {

    @Test
    void testGenerateParenthesis() {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        int n = 3;
        List<String> solution = generateParenthesis.generateAllPossibleParenthesis(3);

        List<String> expectedSolution = new ArrayList<>();
        expectedSolution.add("((()))");
        expectedSolution.add("(()())");
        expectedSolution.add("(())()");
        expectedSolution.add("()(())");
        expectedSolution.add("()()()");

        Assertions.assertEquals(solution, expectedSolution);
    }
}
