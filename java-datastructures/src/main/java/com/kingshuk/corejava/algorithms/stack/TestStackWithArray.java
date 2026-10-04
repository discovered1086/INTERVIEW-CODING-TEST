import com.kingshuk.corejava.algorithms.stack.StackWithArray;

void main(){
    StackWithArray stackWithArray = new StackWithArray();

    stackWithArray.printStack();

    for (int i =0; i<10; i++){
        stackWithArray.push(i);
    }

    stackWithArray.printStack();

    System.out.println(stackWithArray.pop());

    stackWithArray.printStack();

    for (int i=0; i< stackWithArray.size()/2; i++){
        System.out.println(stackWithArray.pop());
    }

    stackWithArray.printStack();
}
