package org.example.datastructure;


import java.util.Objects;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(String data) {
        Node newNode = new Node(data);
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
            System.out.println("Head : " + this.head.data);
        }
    }

    public void getTail() {
        if (this.tail == null) {
            printEmptyListInformation();
        } else {
            System.out.println("Tail: " + this.tail.data);
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
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void append(String data){
        Node newNode = new Node(data);
        if(this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }


    public Node removeLast() {
        if (this.length == 0) {
            return null;
        }
        Node navigator = this.head;
        Node removed;
        while (navigator.next != this.tail) {
            navigator = navigator.next;
        }

        removed = this.tail;
        this.tail = navigator;
        this.tail.next = null;
        this.length--;

        validateEmpty();
        return removed;
    }

    public void prepend(String data) {
        Node newNode = new Node(data);

        if (this.length ==0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {

        if(this.length == 0) {
            return null;
        }

        Node removed = this.head;
        this.head = this.head.next;
        removed.next = null;
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


    public Node get(int index) {
        if(index < 0 || index >= this.length) {
            return null;
        }
        Node navigator = this.head;

        for (int i = 0; i < index; i++) {
            navigator = navigator.next;
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

        Node newNode = new Node(data);
        Node temp = this.get(index -1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public Boolean set(int index, String data) {
        Node temp = get(index);

        if(Objects.nonNull(temp)) {
            temp.data = data;
            return true;
        }
        return false;
    }

    public Node remove(int index) {
        if (index < 0 || index >= this.length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        if (index == this.length -1) {
            return removeLast();
        }

        Node remove = get(index);
        Node previousNode = get(index -1);

        previousNode.next = get(index +1);
        remove.next = null;
        this.length--;

        return remove;
    }


}
