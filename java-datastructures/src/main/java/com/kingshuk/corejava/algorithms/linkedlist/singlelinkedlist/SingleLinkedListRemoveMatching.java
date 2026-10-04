import com.kingshuk.corejava.algorithms.linkedlist.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Before removal....");
    linkedList.traverseList();
    System.out.println("================================");

    linkedList.removeMatchingNode(4);

    System.out.println("After removal....");
    linkedList.traverseList();
}