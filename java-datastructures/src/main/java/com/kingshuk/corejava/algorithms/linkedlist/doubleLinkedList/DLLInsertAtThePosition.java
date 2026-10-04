import com.kingshuk.corejava.algorithms.linkedlist.doubleLinkedList.DoubleLinkedList;

void main() {
    DoubleLinkedList linkedList = new DoubleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Before insertion....");
    linkedList.traverseListForward();
    System.out.println("================================");

    linkedList.insertAtPosition(50, 3);

    System.out.println("After insertion....");
    linkedList.traverseListForward();
}