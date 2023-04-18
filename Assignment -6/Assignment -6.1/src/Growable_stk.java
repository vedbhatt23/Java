import pkg_Stack.Interface_STK;

import java.util.ArrayList;

public class Growable_stk implements Interface_STK {
    private ArrayList<Integer> stack;

    public Growable_stk() {
        this.stack = new ArrayList<Integer>();
    }

    public void push(int a) {
        stack.add(a);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            int value = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return value;
        }
    }

    public void displayStkTop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element: " + stack.get(stack.size() - 1));
        }
    }

    public void displayStk() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack (top to bottom): ");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
        }
    }

    public boolean isEmpty() {
        return (stack.size() == 0);
    }

}