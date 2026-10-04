import com.kingshuk.corejava.algorithms.circularsinglelinkedlist.CircularSingleLinkedList;

void main() {
    CircularSingleLinkedList linkedList = new CircularSingleLinkedList();

    for (int i = 0; i < 5; i++) {
        linkedList.createNode(i);
    }

    linkedList.traverseList();
}