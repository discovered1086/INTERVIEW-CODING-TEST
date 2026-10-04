package com.kingshuk.corejava.algorithms.linkedlist.doubleLinkedList;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DoubleLinkedList {
    private DLLNode head;

    public void createNode(int value) {
        DLLNode dllNode = DLLNode.builder()
                .val(value)
                .build();

        if (head == null) {
            dllNode.setPrevious(null);
            dllNode.setNext(null);
            head = dllNode;
        } else {
            DLLNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            dllNode.setPrevious(temp);
            dllNode.setNext(null);
            temp.setNext(dllNode);
        }
    }

    public void traverseListForward() {
        DLLNode temp = head;

        while (temp != null) {
            System.out.println(temp);
            temp = temp.getNext();
        }
    }

    public void insertAtTheBeginning(int value) {
        DLLNode dllNode = DLLNode.builder()
                .val(value)
                .build();

        if (head == null) {
            dllNode.setNext(null);
        } else {
            dllNode.setNext(head);
            head.setPrevious(dllNode);
        }

        dllNode.setPrevious(null);
        head = dllNode;
    }

    public void insertAtPosition(int value, int position) {
        if (head == null || position == 1) {
            insertAtTheBeginning(value);
        } else {
            DLLNode dllNode = DLLNode.builder()
                    .val(value)
                    .build();

            DLLNode temp = head;
            int counter = 1;

            while(counter < position){
                temp = temp.getNext();
                counter++;
            }

            dllNode.setNext(temp.getNext());
            dllNode.setPrevious(temp);
            temp.getNext().setPrevious(dllNode);
            temp.setNext(dllNode);
        }
    }

    public void insertAtTheEnd(int value) {
        if(head == null){
            insertAtTheBeginning(value);
        }else{
            DLLNode temp = head;

            while(temp.getNext() != null){
                temp = temp.getNext();
            }

            DLLNode dllNode = DLLNode.builder()
                    .val(value)
                    .previous(temp)
                    .next(null)
                    .build();

            temp.setNext(dllNode);
        }
    }
}
