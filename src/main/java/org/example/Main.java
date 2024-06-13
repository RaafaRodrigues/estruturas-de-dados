package org.example;

import org.example.datastructure.LinkedList;
import org.example.datastructure.Stack;

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
        
        int[] numeros = {5,4,3,2,1};
        inverter(numeros);
    }

    private static void inverter(final int[] numeros) {
        Stack stack = new Stack(numeros[0]);

        for (int i = 1 ; i < numeros.length ; i++) {
            stack.push(numeros[i]);
        }

        stack.print();

    }
}