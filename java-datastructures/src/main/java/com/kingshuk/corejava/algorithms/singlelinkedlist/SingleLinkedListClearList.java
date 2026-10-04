import com.kingshuk.corejava.algorithms.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Before removal....");
    linkedList.traverseList();
    System.out.println("================================");

    linkedList.clearList();

    System.out.println("After removal....");
    linkedList.traverseList();
}