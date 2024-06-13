package org.example;

import org.example.datastructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList("ELEMENTO 1");
        list.append("ELEMENTO 2");
        list.append("ELEMENTO 3");
        list.prepend("elemento 0");

        list.remove(2);
        list.remove(0);
        list.print();
    }
}