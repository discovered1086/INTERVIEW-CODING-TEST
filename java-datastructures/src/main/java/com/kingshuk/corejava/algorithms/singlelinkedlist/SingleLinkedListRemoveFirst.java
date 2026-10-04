import com.kingshuk.corejava.algorithms.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Before reversal....");
    linkedList.traverseList();
    System.out.println("================================");

    linkedList.removeFirstNode();

    System.out.println("After reversal....");
    linkedList.traverseList();
}