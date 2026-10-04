package com.kingshuk.corejava.algorithms.stack;

public class StackWithArray {
    private int[] stack;
    private int top = -1;

    //Create the stack
    public StackWithArray(){
        this(10);
    }

    public StackWithArray(int capacity){
        stack = new int[capacity];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int data){
        int size = this.size();
        int capacity = stack.length;

        if(size == capacity){
            throw new RuntimeException("Stack is full");
        }

//        stack[size] = data;
//        top = size;

        stack[++top] = data;
    }

    public int pop(){
        if(this.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        int data = stack[top];
        top--;
        return data;
    }

    public int top(){
        if(this.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return stack[top];
    }

    public void printStack(){
        if(this.isEmpty()){
            System.out.println("Stack is empty");
        }

        StringBuilder builder = new StringBuilder();

       for (int i = 0; i<=top; i++){
           builder.append(" ").append(stack[i]).append(" |");
       }

        System.out.println(builder);
    }
}
