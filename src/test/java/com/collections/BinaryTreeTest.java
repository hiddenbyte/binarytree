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
        assertEquals("50 17 72 12 23 54 12 23 54 76 9 14 67", binaryTree.printTree());
    }
}