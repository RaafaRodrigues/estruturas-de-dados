package org.example;

import org.example.datastructure.*;
import org.example.problems.LargestTreeValues;
import org.example.problems.NumericExpressionValidation;
import org.example.problems.QueueReverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList("ELEMENTO 1");
//        list.append("ELEMENTO 2");
//        list.append("ELEMENTO 3");
//        list.prepend("elemento 0");
//
//        list.remove(2);
//        list.remove(0);
//        list.print();
//        Stack stack = new Stack(1);
//
//        stack.push(2);
//        stack.push(3);
//
//        stack.getTop();
//        stack.getHeight();
//        stack.print();
//        stack.pop();
//
//        stack.getTop();
//        stack.getHeight();
//        stack.print();
//
//        stack.pop();
//
//        stack.getTop();
//        stack.getHeight();
//        stack.print();
        
//        int[] numeros = {5,4,3,2,1};
//        inverter(numeros);

//        Queue queue = new Queue(1);
//
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();
//        queue.print();
//
//        queue.enqueue(2);
//        queue.enqueue(7);
//
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();
//        queue.print();
//
//        queue.dequeue();
//
//        queue.getFirst();
//        queue.getLast();
//        queue.getLength();
//        queue.print();

//        Tree tree = new Tree();
//        tree.insert(37);
//        tree.insert(11);
//        tree.insert(66);
//
//        tree.insert(8);
//        tree.insert(17);
//        tree.insert(42);
//
//        tree.insert(72);
//
//
//        tree.breadthFirstSearch();

//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(37);
//        binarySearchTree.insert(66);
//        binarySearchTree.insert(42);
//        binarySearchTree.insert(11);
//        binarySearchTree.insert(72);
//        binarySearchTree.insert(8);
//        binarySearchTree.insert(17);
//
//        binarySearchTree.removerNode(8);
//        binarySearchTree.inOrder();

//        NumericExpressionValidation numericExpressionValidation = new
//                NumericExpressionValidation();
//        System.out.println(numericExpressionValidation.solve("2*(3+4+5*[2+3)]"));
//
//        System.out.println(numericExpressionValidation.solve("2*(3+4+5*[2+3])"));

//        QueueReverse queueReverse = new QueueReverse();
//        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//        System.out.println(queueReverse.reverseFirstK(queue, 3));

        Tree tree = new Tree();
        tree.insert(100);

        tree.insert(10);
        tree.insert(5);

        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        tree.insert(5);

        LargestTreeValues largestTreeValues = new LargestTreeValues();
        System.out.println(largestTreeValues.largestValues(tree));

    }

    private static void inverter(final int[] numeros) {
        Stack stack = new Stack(numeros[0]);

        for (int i = 1 ; i < numeros.length ; i++) {
            stack.push(numeros[i]);
        }

        stack.print();

    }
}