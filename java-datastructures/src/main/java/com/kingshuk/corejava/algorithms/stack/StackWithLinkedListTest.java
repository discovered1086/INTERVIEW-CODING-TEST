import com.kingshuk.corejava.algorithms.stack.StackWithLinkedList;

void main(){
    StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();

    for (int i = 0; i < 5; i++) {
        stackWithLinkedList.push(i);
    }

    stackWithLinkedList.printStack();

    System.out.println(stackWithLinkedList.pop());
    System.out.println(stackWithLinkedList.pop());

    stackWithLinkedList.printStack();
}
