package org.example.datastructure.nodes;

import lombok.Data;

@Data
public class Node<T> {

    protected T data;
    protected Node<T> next;
    public Node(T data) {
        this.data = data;
    }
}
