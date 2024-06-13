package org.example.datastructure;

import org.example.datastructure.nodes.Node;

public class Stack {
    private Node<Integer> top;
    private int height;


    public Stack(int value) {
        this.top = new Node<>(value);
        this.height = 1;
    }

    public void getTop() {
        if (this.top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: "+ top.getData());
        }
    }

    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    public void print() {
        System.out.println("#########################");
        Node<Integer> navigator = this.top;
        while (navigator != null) {
            System.out.println(navigator.getData());
            navigator = navigator.getNext();
        }
        System.out.println("#########################");
    }

    public void push(int value) {
        Node<Integer> newNode = new Node<>(value);
        if (height == 0) {
            this.top = newNode;
        } else {
            newNode.setNext(top);
            top = newNode;
        }
        height++;
    }

    public Node<Integer> pop() {
        if (top == null) {
            return null;
        }
        var temp = this.top;
        this.top = this.top.getNext();
        temp.setNext(null);
        this.height--;
        return temp;
    }
}
