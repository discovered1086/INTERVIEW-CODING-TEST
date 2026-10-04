package com.kingshuk.corejava.algorithms.stack.usecases.stringreverser;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StackWithLinkedList {
    private int length;
    private ListNode top;

    public void push(char data) {
        ListNode listNode = ListNode.builder()
                .val(data)
                .next(top)
                .build();

        top = listNode;
        length++;
    }

    public void printStack() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            throw new RuntimeException("Stack is empty");
        }

        ListNode currentNode = top;
        System.out.println("==============================");
        while (currentNode != null) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

    public char pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            throw new RuntimeException("Stack is empty");
        }
        char result = top.getVal();
        top = top.getNext();
        length--;
        return result;
    }

    public char peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            throw new RuntimeException("Stack is empty");
        }
        return top.getVal();
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
