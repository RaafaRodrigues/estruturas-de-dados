package org.example.datastructure;

import lombok.Getter;
import org.example.datastructure.nodes.Node;
import org.example.datastructure.nodes.NodeTree;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

@Getter
public class Tree {
    private NodeTree root;

    public void insert(int value) {
        NodeTree newNode = new NodeTree(value);
        if (Objects.isNull(root)) {
            this.root = newNode;
        } else {
            Queue<NodeTree> queue = new LinkedList<>();
            queue.add(this.root);

            while (!queue.isEmpty()) {
                NodeTree currentElement = queue.remove();

                if(Objects.isNull(currentElement.getLeft())) {
                    currentElement.setLeft(newNode);
                    break;
                } else {
                    queue.add(currentElement.getLeft());
                }

                if(Objects.isNull(currentElement.getRight())) {
                    currentElement.setRight(newNode);
                    break;
                } else {
                    queue.add(currentElement.getRight());
                }

            }

        }
    }


    public void preOrder() {
        preOrder(this.root);
    }

    private void preOrder(NodeTree node) {
        if (Objects.isNull(node)) {
            return;
        }
        System.out.println(node.getValue());
        preOrder(node.getLeft());
        preOrder(node.getRight());
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

    public void posOrder() {
        posOrder(this.root);
    }

    private void posOrder(NodeTree node) {
        if (Objects.isNull(node)) {
            return;
        }
        posOrder(node.getLeft());
        posOrder(node.getRight());
        System.out.println(node.getValue());
    }

    public void breadthFirstSearch() {
        if (Objects.isNull(this.root)) {
            return;
        }
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(this.root);


        while (!queue.isEmpty()) {
            NodeTree currentNode = queue.remove();
            if (Objects.nonNull(currentNode.getLeft())) {
                queue.add(currentNode.getLeft());
            }

            if (Objects.nonNull(currentNode.getRight())) {
                queue.add(currentNode.getRight());
            }

            System.out.println(currentNode.getValue());
        }
    }



}
