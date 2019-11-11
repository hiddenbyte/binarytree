package com.collections;

import java.util.List;
import java.util.Objects;

/**
 * Sample implementation of a binary tree
 *
 * @param <T>
 */
class BinaryTree<T extends Comparable<T>> {

    private Node<T> root;

    BinaryTree(List<T> values) {
        values.forEach(this::add);
    }

    private void add(T value) {
        if (root == null) {
            root = new Node<>(value);
        } else {
            add(this.root, value);
        }
    }

    private void add(Node<T> node, T value) {
        if (node.compareTo(value) > 0) {
            if (node.left == null) {
                node.left = new Node<>(value);
            } else {
                add(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node<>(value);
            } else {
                add(node.right, value);
            }
        }
    }

    /**
     * Should find the smaller item in the tree
     *
     * @return smallest value
     */
    T findSmaller() {
        throw new UnsupportedOperationException("Please implement this method");
    }

    /**
     * Should find the biggest item in the tree
     *
     * @return biggest value
     */
    T findBiggest() {
        throw new UnsupportedOperationException("Please implement this method");
    }

    /**
     * Should create a string with all the items in order, from top to bottom, left to right
     *
     * @return string with a space between each element
     */
    String printTree() {
        throw new UnsupportedOperationException("Please implement this method");
    }

    @Override
    public int hashCode() {
        return Objects.hash(root);
    }

    private static class Node<T extends Comparable<T>> implements Comparable<T> {
        private T value;
        private Node<T> left;
        private Node<T> right;

        private Node(T value) {
            this.value = value;
        }

        @Override
        public int compareTo(T o) {
            if (o == null) {
                return 1;
            }
            return this.value.compareTo(o);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(value, node.value) &&
                    Objects.equals(left, node.left) &&
                    Objects.equals(right, node.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, left, right);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }
}
