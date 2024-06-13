package org.example.datastructure;

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
            System.out.println("First :" + this.first.data);
            return this.first.data;
        }
        System.out.println("Fila está vazia");
        return null;
    }

    public Integer getLast() {
        if (Objects.nonNull(this.last)) {
            System.out.println("Last :" + this.last.data);
            return this.last.data;
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
            System.out.println(navigator.data);
            navigator = navigator.next;
        }
        System.out.println("#########################");
    }

    public void enqueue(int value) {
        Node<Integer> newNode = new Node<>(value);

        if (this.length == 0) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.next = newNode;
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

       this.first = this.first.next;
       remove.next = null;
       this.length--;
       return remove;
    }
}
