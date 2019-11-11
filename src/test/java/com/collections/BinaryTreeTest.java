package com.collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree<Integer> binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree<>(List.of(50,17,12,23,9,14,72,54,76,67));
    }

    @Test
    void testFindSmaller() {
        assertEquals(9, binaryTree.findSmaller());
    }

    @Test
    void testFindBiggest() {
        assertEquals(76, binaryTree.findBiggest());
    }

    @Test
    void testPrintTree() {
        assertEquals("9 12 14 17 23 50 54 67 72 76", binaryTree.printTree());
    }
}