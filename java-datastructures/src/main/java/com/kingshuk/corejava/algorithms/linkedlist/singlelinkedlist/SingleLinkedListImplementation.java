import com.kingshuk.corejava.algorithms.linkedlist.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    linkedList.traverseList();
}