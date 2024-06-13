package org.example.datastructure;

import org.example.datastructure.nodes.NodeTree;

import java.util.Objects;


public class BinarySearchTree {

    private NodeTree root;


    public void  insert(int value) {
        NodeTree newNode = new NodeTree(value);

        if (Objects.isNull(this.root)) {
            this.root = newNode;
        } else {
            insert(this.root, value);
        }
    }

    private void  insert(NodeTree root, int value) {
       if(Objects.isNull(root) || value == root.getValue()) {
           return;
       }

       NodeTree newValue = new NodeTree(value);

       if (value > root.getValue()) {
           if (Objects.isNull(root.getRight())) {
               root.setRight(newValue);
           } else {
               insert(root.getRight(), value);
           }
       } else {
           if (Objects.isNull(root.getLeft())) {
               root.setLeft(newValue);
           } else {
               insert(root.getLeft(), value);
           }
       }
    }

    public void inOrder() {
        inOrder(this.root);
    }

    private void inOrder(NodeTree node) {
        if (Objects.isNull(node)) {
            return;
        }
        inOrder(node.getLeft());
        System.out.println(node.getValue());
        inOrder(node.getRight());
    }


    public boolean contains(int value) {
        return contains(this.root, value);
    }

    public boolean contains(NodeTree root, int value) {
        if (Objects.isNull(root)) {
            return false;
        }
        if (root.getValue() == value) {
            return true;
        }

        if (value > this.root.getValue()) {
           return contains(root.getRight(), value);
        }
        return contains(root.getLeft(), value);
    }

    public NodeTree removerNode(int value) {
        this.root = removerNode(this.root, value);
        return this.root;
    }

    private NodeTree removerNode(NodeTree root, int value) {
        if (Objects.isNull(root)) {
            return null;
        }

        if (value < root.getValue()) {
            root.setLeft(removerNode(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(removerNode(root.getRight(), value));
        } else {
            if (root.isLeaf()) {
                return null;
            } else if (Objects.isNull(root.getLeft())) {
                return root.getRight();
            } else if (Objects.isNull(root.getRight())) {
                return root.getLeft();
            } else {
                int minValue = minValue(root.getRight());
                root.setValue(minValue);
                root.setRight(removerNode(root.getRight(), minValue));
            }
        }
        return root;
    }

    public int minValue(NodeTree currentNode) {
        while (Objects.nonNull(currentNode.getLeft())) {
            currentNode = currentNode.getLeft();
        }

        return currentNode.getValue();
    }
}
