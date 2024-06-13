package org.example.datastructure.nodes;

import lombok.Data;

import java.util.Objects;

@Data
public class NodeTree {

    private int value;
    private NodeTree left;

    private NodeTree right;

    public NodeTree(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return (Objects.isNull(this.left))
                && (Objects.isNull(this.right));
    }
}
