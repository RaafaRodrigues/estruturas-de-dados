package org.example.datastructure;

import org.example.datastructure.nodes.Node;

import java.util.Objects;

public class Queue {

    private Node<Integer> first;
    private Node<Integer> last;

    private int length;


    public Queue(int value) {
        Node<Integer> newNode = new Node<>(value);
        this.first = newNode;
        this.last = newNode;
        this.length++;
    }

    public Integer getFirst() {
        if (Objects.nonNull(this.first)) {
            System.out.println("First :" + this.first.getData());
            return this.first.getData();
        }
        System.out.println("Fila está vazia");
        return null;
    }

    public Integer getLast() {
        if (Objects.nonNull(this.last)) {
            System.out.println("Last :" + this.last.getData());
            return this.last.getData();
        }
        System.out.println("Fila está vazia");
        return null;
    }

    public int getLength() {
        System.out.println("Lenght: " + length);
        return length;
    }

    public void print() {
        Node<Integer> navigator = this.first;
        System.out.println("#########################");
        while (navigator != null){
            System.out.println(navigator.getData());
            navigator = navigator.getNext();
        }
        System.out.println("#########################");
    }

    public void enqueue(int value) {
        Node<Integer> newNode = new Node<>(value);

        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.length++;
    }

    public Node<Integer> dequeue() {
       if (this.length == 0) {
           return null;
       }
       Node<Integer> remove = this.first;

       if (this.length == 1) {
           this.last = null;
           this.first = null;
           return remove;
       }

       this.first = this.first.getNext();
       remove.setNext(null);
       this.length--;
       return remove;
    }
}
