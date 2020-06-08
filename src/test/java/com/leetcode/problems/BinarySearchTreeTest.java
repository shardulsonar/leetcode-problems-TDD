package com.leetcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTreeTest {

    @Test
    void testBinarySearchTree(){
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int [] array = {1,4,6,8,10,23,45,67,78,90,123,234,345,567,781,9000};
        int expected = 6;
        int actual = binarySearchTree.getLocation(array, 45);
        Assertions.assertEquals(expected, actual);
    }
}
