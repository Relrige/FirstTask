package com.fido;


class Node<T> {
    public T data;
    public Node<T> next;
}

class TwoThirdsOfLinkedList {

    public <T> Node<T> getTwoThirdsNode(Node<T> head) {
        if (head == null || head.next == null) {
            return null;
        }

        int totalNodes = 1;
        int resultSteps=0;

        Node<T> result = null;
        Node<T> runnerToEnd = head;

        while (runnerToEnd.next != null) {
            runnerToEnd = runnerToEnd.next;
            totalNodes++;

            if((totalNodes * 2) / 3 - 1 >= resultSteps){
                if(resultSteps==0) {
                    result = head;
                } else {
                    result = result.next;
                }
                resultSteps++;
            }
        }
        return result;
    }
}
