package com.kingshuk.corejava.algorithms.singlelinkedlist;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SingleLinkedList {
    private ListNode head;

    public void createNode(int value) {
        //Create the node
        ListNode listNode = ListNode.builder()
                .val(value)
                .next(null)
                .build();

        //Assign the node as the first node if head is null
        if (head == null) {
            head = listNode;
        } else {
            //Traverse the list until we find the last node
            ListNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            //Assign the nodes with the new node properly
            temp.setNext(listNode);
        }
    }

    public void traverseList() {
        ListNode currentNode = head;

        while (currentNode != null) {
            //Print the data
//            System.out.println("|| " + currentNode.getVal()+" ||");
            System.out.println(currentNode);
            currentNode = currentNode.getNext();
        }
    }

    public void insertNodeAtTheBeginning(int value) {
        ListNode temp = head;

        head = ListNode.builder()
                .val(value)
                .next(temp)
                .build();
    }

    public void insertNodeAtTheEnd(int value) {
        ListNode temp = head;

        ListNode lastNode = ListNode.builder()
                .val(value)
                .next(null)
                .build();

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        temp.setNext(lastNode);
    }

    public void insertNodeAfter(int value, int position) {
        ListNode temp = head;
        int counter = 1;
        boolean doesPositionExist = true;

        //Handle first position
        if (position == 0) {
            insertNodeAtTheBeginning(value);
            return;
        }

        ListNode newNode = ListNode.builder()
                .val(value)
                .next(null)
                .build();

        while (counter < position) {
            temp = temp.getNext();
            if (temp == null) {
                doesPositionExist = false;
                break;
            }
            counter++;
        }

        if (doesPositionExist) {
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
        } else {
            System.out.println("The position does not exist in the list");
        }

    }

    /**
     * Let's trace this linked list for each loop 1 -> 2 -> 3 -> null
     * Initial state
     * prev (null)        curr
     * ↓                 ↓
     * [null]             [1]  ──>  [2]  ──>  [3]  ──>  null
     * <p>
     * After iteration 1
     * prev        curr
     * ↓           ↓
     * null  <──  [1]  <---   [2]  ──>  [3]  ──>  null
     * <p>
     * After iteration 2
     * prev     curr
     * ↓         ↓
     * null  <──  [1]  <---   [2]  <---  [3]  ──>  null
     *
     */
    public void reverse() {
        ListNode nextNode;
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            //Update the value
            currentNode.setNext(previousNode);
            //Move the pointers
            previousNode = currentNode;
            currentNode = nextNode;
        }

        head = previousNode;
    }


    public boolean hasLoop() {
        ListNode startPointer = head;
        ListNode endPointer = head;

        while (startPointer != null && endPointer != null && endPointer.getNext() != null) {
            startPointer = startPointer.getNext();
            endPointer = endPointer.getNext().getNext();

            if (startPointer == endPointer) {
                return true;
            }
        }
        return false;
    }

    public void removeFirstNode() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public void removeMatchingNode(int value) {
        ListNode previousNode = null;
        ListNode nextNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.getNext();
            if (currentNode.getVal() == value) {
                if (currentNode == head) {
                    head = nextNode;
                } else {
                    previousNode.setNext(nextNode);
                }
                return;
            }

            previousNode = currentNode;
            currentNode = nextNode;

        }
    }

    public void clearList() {
        head = null;
    }

    public int findNthNodeFromTheEnd(int position) {
        ListNode target = head;
        ListNode current = head;
        int counter = 0;

        if (head == null) {
            throw new IllegalArgumentException("The list is empty");
        }

        while (target != null) {
            while (current != null) {
                current = current.getNext();
                counter++;
            }
            if (counter == position) {
                return target.getVal();
            }
            target = target.getNext();
            current = target;
            counter = 0;
        }

        return -1;
    }
}
