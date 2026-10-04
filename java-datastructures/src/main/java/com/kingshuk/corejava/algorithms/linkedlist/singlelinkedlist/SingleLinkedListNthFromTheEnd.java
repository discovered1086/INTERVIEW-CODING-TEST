import com.kingshuk.corejava.algorithms.linkedlist.singlelinkedlist.SingleLinkedList;

void main() {
    SingleLinkedList linkedList = new SingleLinkedList();

    for (int i = 0; i < 2; i++) {
        linkedList.createNode(i);
    }


    linkedList.traverseList();
    System.out.println("================================");

    int nthNodeFromTheEnd = linkedList.findNthNodeFromTheEnd(4);

    System.out.println("The nth from the end is...." + nthNodeFromTheEnd);
}