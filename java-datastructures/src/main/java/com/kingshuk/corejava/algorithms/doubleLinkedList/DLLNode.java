package com.kingshuk.corejava.algorithms.doubleLinkedList;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Builder
public class DLLNode {
    private int val;
    private DLLNode next;
    @ToString.Exclude
    private DLLNode previous;
}
