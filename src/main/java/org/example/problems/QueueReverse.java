package org.example.problems;


import java.util.Queue;

public class QueueReverse {

    public Queue<Integer> reverseFirstK(Queue<Integer> queue, int k){
        solveQueue(queue, k);
        int n = queue.size() - k;

        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private void solveQueue(Queue<Integer> queue, int k) {
        if (k == 0) {
            return;
        }
        int element = queue.remove();
        solveQueue(queue, k-1);
        queue.add(element);
    }
}
