package org.example.queu_stack;

import java.util.Stack;

public class Queue {
    Stack<Integer> stack1;
    Stack <Integer>stack2;
    public Queue(){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }
    public int peek(){
        if(stack2.isEmpty()){
       while(!stack1.isEmpty()){
           stack2.push(stack1.pop());
       }}
       return stack2.peek();
    }
    public void push(int x){
        stack1.push(x);
    }
    public int pop(){
        if(stack2.isEmpty()){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }}
        return stack2.isEmpty()?-1: stack2.pop();
    }
    public boolean empty(){
    return stack2.isEmpty()&& stack1.isEmpty();
    }
}
