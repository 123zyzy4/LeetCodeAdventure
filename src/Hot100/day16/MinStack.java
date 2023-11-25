package Hot100.day16;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    public MinStack() {
        stack = new Stack<>();
        minstack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if(minstack.isEmpty()||minstack.peek()>=val){
            minstack.push(val);
        }
    }

    public void pop() {
        if(minstack.peek()== stack.pop()){
            minstack.pop();
        }
//        if(minstack.peek().equals(stack.pop()) ){
//            minstack.pop();
//        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
