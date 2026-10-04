package com.kingshuk.corejava.algorithms.linkedlist.circularsinglelinkedlist;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
public class CircularListNode {
    private int val;
    @ToString.Exclude
    private CircularListNode next;
}
