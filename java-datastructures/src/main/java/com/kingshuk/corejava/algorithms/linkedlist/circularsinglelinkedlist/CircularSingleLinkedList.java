package com.kingshuk.corejava.algorithms.linkedlist.circularsinglelinkedlist;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CircularSingleLinkedList {
    private CircularListNode head;

    public void createNode(int value) {
        //Create the node
        CircularListNode listNode = CircularListNode.builder()
                .val(value)
                .next(null)
                .build();

        //Assign the node as the first node if head is null
        if (head == null) {
            head = listNode;
            listNode.setNext(listNode);
        } else {
            //Traverse the list until we find the last node
            CircularListNode temp = head;

            while (temp.getNext() != head) {
                temp = temp.getNext();
            }

            //Assign the nodes with the new node properly
            temp.setNext(listNode);
            listNode.setNext(head);
        }
    }

    public void traverseList() {
        CircularListNode currentNode = head;

        while (currentNode.getNext() != head) {
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }

        System.out.println(currentNode);
    }
}
