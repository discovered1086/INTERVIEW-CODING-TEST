import com.kingshuk.corejava.algorithms.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    System.out.println("Does the linked list have a loop? " + linkedList.hasLoop());
}