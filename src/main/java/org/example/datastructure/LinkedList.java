package org.example.datastructure;


import org.example.datastructure.nodes.Node;

import java.util.Objects;

public class LinkedList {
    private Node<String> head;
    private Node<String> tail;
    private int length;

    public LinkedList(String data) {
        Node<String> newNode = new Node<>(data);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }


    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void getHead() {
        if (this.head == null) {
            printEmptyListInformation();
        } else {
            System.out.println("Head : " + this.head.getData());
        }
    }

    public void getTail() {
        if (this.tail == null) {
            printEmptyListInformation();
        } else {
            System.out.println("Tail: " + this.tail.getData());
        }
    }

    private void printEmptyListInformation() {
        System.out.println("Lista vazia");
    }


    public void makeEmpty() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }


    public void print() {
        Node<String> temp = this.head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void append(String data){
        Node<String> newNode = new Node<>(data);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }


    public Node<String> removeLast() {
        if (this.length == 0) {
            return null;
        }
        Node<String> navigator = this.head;
        Node<String> removed;
        while (navigator.getNext() != this.tail) {
            navigator = navigator.getNext();
        }

        removed = this.tail;
        this.tail = navigator;
        this.tail.setNext(null);
        this.length--;

        validateEmpty();
        return removed;
    }

    public void prepend(String data) {
        Node<String> newNode = new Node<>(data);

        if (this.length ==0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.length++;
    }

    public Node<String> removeFirst() {

        if(this.length == 0) {
            return null;
        }

        Node<String> removed = this.head;
        this.head = this.head.getNext();
        removed.setNext(null);
        this.length--;

        validateEmpty();

        return removed;
     }

    private void validateEmpty() {
        if (this.length == 0) {
            this.head = null;
            this.tail = null;
        }
    }


    public Node<String> get(int index) {
        if(index < 0 || index >= this.length) {
            return null;
        }
        Node<String> navigator = this.head;

        for (int i = 0; i < index; i++) {
            navigator = navigator.getNext();
        }

        return navigator;
    }

    public Boolean insert(int index, String data) {
        if(index < 0 || index > this.length) {
            return false;
        }

        if (index == 0) {
            this.prepend(data);
            return true;
        }

        if (index == this.length) {
            this.append(data);
            return true;
        }

        Node<String> newNode = new Node<>(data);
        Node<String> temp = this.get(index -1);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        this.length++;
        return true;
    }

    public Boolean set(int index, String data) {
        Node<String> temp = get(index);

        if(Objects.nonNull(temp)) {
            temp.setData(data);
            return true;
        }
        return false;
    }

    public Node<String> remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == this.length -1) {
            return removeLast();
        }

        Node<String> remove = get(index);
        Node<String> previousNode = get(index -1);

        previousNode.setNext(get(index +1));
        remove.setNext(null);
        this.length--;

        return remove;
    }


}
