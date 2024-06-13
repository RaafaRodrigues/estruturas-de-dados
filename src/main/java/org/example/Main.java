package org.example;

import org.example.datastructure.LinkedList;
import org.example.datastructure.Queue;
import org.example.datastructure.Stack;
import org.example.datastructure.Tree;

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

        Tree tree = new Tree();
        tree.insert(37);
        tree.insert(11);
        tree.insert(66);

        tree.insert(8);
        tree.insert(17);
        tree.insert(42);

        tree.insert(72);


        tree.breadthFirstSearch();

    }

    private static void inverter(final int[] numeros) {
        Stack stack = new Stack(numeros[0]);

        for (int i = 1 ; i < numeros.length ; i++) {
            stack.push(numeros[i]);
        }

        stack.print();

    }
}