package org.example.problems;

import org.example.datastructure.Tree;
import org.example.datastructure.nodes.NodeTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LargestTreeValues {

    public List<Integer> largestValues(Tree tree) {
        var list = new ArrayList<Integer>();
        solveTree(tree.getRoot(), 0, list);

        return list;
    }

    private void solveTree(NodeTree root, int level, ArrayList<Integer> list) {
        if (Objects.isNull(root)) {
            return;
        }

        if (level == list.size()) {
            list.add(root.getValue());
        } else {
            list.set(level, Math.max(list.get(level), root.getValue()));
        }
        level ++;
        solveTree(root.getLeft(), level, list);
        solveTree(root.getRight(), level, list);
    }
}
