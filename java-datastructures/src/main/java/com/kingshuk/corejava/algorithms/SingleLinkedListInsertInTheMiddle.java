import com.kingshuk.corejava.algorithms.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Before insertion....");
    linkedList.traverseList();
    System.out.println("================================");

    linkedList.insertNodeAfter(50, 5);

    System.out.println("After insertion....");
    linkedList.traverseList();
}