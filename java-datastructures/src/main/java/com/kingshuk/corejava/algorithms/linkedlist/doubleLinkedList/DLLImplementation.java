import com.kingshuk.corejava.algorithms.linkedlist.doubleLinkedList.DoubleLinkedList;

void main() {
    DoubleLinkedList linkedList = new DoubleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    linkedList.traverseListForward();
}